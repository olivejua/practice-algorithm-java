package com.olivejua.tree;

public class RootEqualsSumOfChildren {

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
