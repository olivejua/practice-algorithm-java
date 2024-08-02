package com.olivejua.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(root, targetSum, 0, new ArrayList<>(), result);

        return result;
    }

    private void dfs(TreeNode node, int targetSum, int currentSum, List<Integer> path, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        ArrayList<Integer> newPath = new ArrayList<>(path);
        newPath.add(node.val);
        currentSum += node.val;

        if (isLeafNode(node) && targetSum == currentSum) {
            result.add(newPath);
        } else {
            dfs(node.left, targetSum, currentSum, newPath, result);
            dfs(node.right, targetSum, currentSum, newPath, result);
        }
    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }

}
