package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal2Test {
    private ConstructBinaryTreeFromPreorderAndInorderTraversal2 problem = new ConstructBinaryTreeFromPreorderAndInorderTraversal2();

    @Test
    public void test1() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode result = problem.buildTree(preorder, inorder);

        Assertions.assertThat(result.val).isEqualTo(3);
        Assertions.assertThat(result.left.val).isEqualTo(9);
        Assertions.assertThat(result.right.val).isEqualTo(20);
        Assertions.assertThat(result.right.left.val).isEqualTo(15);
        Assertions.assertThat(result.right.right.val).isEqualTo(7);
    }

    @Test
    public void test2() {
        int[] preorder = {-1};
        int[] inorder = {-1};

        TreeNode result = problem.buildTree(preorder, inorder);

        Assertions.assertThat(result.val).isEqualTo(-1);
    }
}
