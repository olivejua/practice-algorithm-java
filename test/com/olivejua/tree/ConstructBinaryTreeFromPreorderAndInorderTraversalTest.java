package com.olivejua.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    private final ConstructBinaryTreeFromPreorderAndInorderTraversal PROBLEM = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    public void test1() {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7, 9, 8};
        int[] inorder = {4, 2, 5, 1, 7, 9, 6, 8, 3};

        TreeNode result = PROBLEM.buildTree(preorder, inorder);
    }
}