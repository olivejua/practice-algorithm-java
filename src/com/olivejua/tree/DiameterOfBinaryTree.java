package com.olivejua.tree;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {
    int longest;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);

        return longest;
    }

    int dfs(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        this.longest = Math.max(this.longest, left + right + 2); // 거리
        return Math.max(left, right) + 1; // 상태값
    }
}
