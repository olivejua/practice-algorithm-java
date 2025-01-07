package com.olivejua.graph;

public class CountNodesEqualToAverageOfSubtree {
    private int result;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);

        return result;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[] {0,0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int leftNodes = left[0];
        int leftSum = left[1];

        int rightNodes = right[0];
        int rightSum = right[1];

        int numberOfNodes = 1 + leftNodes + rightNodes;
        int sum = node.val + leftSum + rightSum;

        int average = sum / numberOfNodes;
        if (average == node.val) {
            result++;
        }

        return new int[] {numberOfNodes, sum};
    }
}
