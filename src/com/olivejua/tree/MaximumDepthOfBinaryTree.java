package com.olivejua.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * http://leetcode.com/problems/maximum-depth-of-binary-tree
 */
public class MaximumDepthOfBinaryTree {

    //BFS
    public int maxDepthBFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            depth += 1;
            int q_size = queue.size();
            for (int i = 0; i < q_size; i++) {
                TreeNode cur = queue.poll();

                if (cur.left != null) {
                    queue.add(cur.left);
                }

                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
        }

        return depth;
    }

    //DFS
    public int maxDepthDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepthDFS(root.left);
        int right = maxDepthDFS(root.right);

        return Math.max(left, right) + 1;
    }
}
