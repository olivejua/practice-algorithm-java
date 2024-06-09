package com.olivejua.tree;

/**
 * https://leetcode.com/problems/longest-univalue-path
 */
public class LongestUnivaluePath {
    int result;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);

        return result;
    }

    int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (root.left != null && root.left.val == root.val) {
            left += 1;
        } else {
            left = 0;
        }

        if (root.right != null && root.right.val == root.val) {
            right += 1;
        } else {
            right = 0;
        }

        this.result = Math.max(this.result, left + right);

        return Math.max(left, right);
    }
}
