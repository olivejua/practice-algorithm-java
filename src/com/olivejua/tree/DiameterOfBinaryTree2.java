package com.olivejua.tree;

public class DiameterOfBinaryTree2 {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root);

        return maxDiameter;
    }

    int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);

        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
