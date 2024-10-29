package com.olivejua.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree2 {

    public int maxDepth(TreeNode root) {
        int result = 0;

        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            result++;

            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return result;
    }
}
