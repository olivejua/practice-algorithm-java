package com.olivejua.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        int count = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                continue;
            }

            count++;

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return count;
    }
}
