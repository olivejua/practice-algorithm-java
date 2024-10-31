package com.olivejua.tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTree2 {

    public List<TreeNode> generateTrees(int n) {
        return buildTree(1, n);
    }

    List<TreeNode> buildTree(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        if (start > end) {
            result.add(null);
            return result;
        }

        for (int node = start; node <= end; node++) {
            List<TreeNode> leftSubtrees = buildTree(start, node-1);
            List<TreeNode> rightSubtrees = buildTree(node + 1, end);

            for (TreeNode leftSubtree : leftSubtrees) {
                for (TreeNode rightSubtree : rightSubtrees) {
                    TreeNode root = new TreeNode(node);
                    root.left = leftSubtree;
                    root.right = rightSubtree;
                    result.add(root);
                }
            }
        }

        return result;
    }
}
