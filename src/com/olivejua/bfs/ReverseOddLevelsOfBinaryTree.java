package com.olivejua.bfs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseOddLevelsOfBinaryTree {

    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        int level = 0;
        q.add(root);

        LinkedList<TreeNode> parents = new LinkedList<>();
        parents.add(root);
        while (!q.isEmpty()) {
            int q_size = q.size();

            for (int i = 0; i < q_size; i++) {
                TreeNode node = q.poll();

                if (node.left != null && node.right != null) {
                    q.add(node.left);
                    q.add(node.right);
                }
            }

            if ((++level)%2 == 0) {
                LinkedList<TreeNode> queue_copy = new LinkedList<>(q);

                int parents_size = parents.size();
                for (int i = 0; i < parents_size; i++) {
                    TreeNode parent = parents.poll();
                    parent.left = queue_copy.poll();
                    parent.right = queue_copy.poll();
                    parents.add(parent.left);
                    parents.add(parent.right);
                }
            } else {
                //reversed
                LinkedList<TreeNode> stack_copy = new LinkedList<>();
                for (TreeNode node : q) {
                    stack_copy.addFirst(node);
                }

                int parents_size = parents.size();
                for (int i = 0; i < parents_size; i++) {
                    TreeNode parent = parents.poll();
                    parent.left = stack_copy.poll();
                    parent.right = stack_copy.poll();
                    parents.add(parent.left);
                    parents.add(parent.right);
                }
            }
        }

        return root;
    }

    public TreeNode reverseOddLevels2(TreeNode root) {
        if (root == null) {
            return null;
        }

        reverse(root.left, root.right, 1);
        return root;
    }

    private void reverse(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) return;

        if (level % 2 == 1) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        reverse(left.left, right.right, level+1);
        reverse(left.right, right.left, level+1);
    }
}
