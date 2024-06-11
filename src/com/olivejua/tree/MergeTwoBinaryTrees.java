package com.olivejua.tree;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        TreeNode result = new TreeNode();
        if (root1 == null) {
            result.val = root2.val;
            result.left = mergeTrees(null, root2.left);
            result.right = mergeTrees(null, root2.right);
        } else if (root2 == null) {
            result.val = root1.val;
            result.left = mergeTrees(root1.left, null);
            result.right = mergeTrees(root1.right, null);
        } else {
            result.val = root1.val + root2.val;
            result.left = mergeTrees(root1.left, root2.left);
            result.right = mergeTrees(root1.right, root2.right);
        }

        return result;
    }

    public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = mergeTrees2(root1.left, root2.left);
        node.right = mergeTrees2(root1.right, root2.right);

        return node;
    }
}
