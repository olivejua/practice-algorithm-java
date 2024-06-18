package com.olivejua.tree;

/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree
 */
public class BinarySearchTreeToGreaterSumTree {
    int val = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            val += root.val;
            root.val = val;
            bstToGst(root.left);
        }

        return root;
    }
}
