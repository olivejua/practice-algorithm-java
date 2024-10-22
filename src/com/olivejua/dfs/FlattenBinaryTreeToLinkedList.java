package com.olivejua.dfs;

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root);
    }

    TreeNode dfs(TreeNode node) {
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = null;
        node.right = null;

        if (left != null) {
            node.right = left;
            node = node.right;
            node = dfs(node);
        }

        if (right != null) {
            node.right = right;
            node = node.right;
            node = dfs(node);
        }

        return node;
    }
}
