package com.olivejua.tree;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }

        if (original == target) {
            return cloned;
        }

        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null) {
            return left;
        }

        TreeNode right = getTargetCopy(original.right, cloned.right, target);
        if (right != null) {
            return right;
        }

        return null;
    }
}
