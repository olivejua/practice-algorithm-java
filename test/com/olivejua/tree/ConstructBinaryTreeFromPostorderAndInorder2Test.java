package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromPostorderAndInorder2Test {

    private final ConstructBinaryTreeFromPostorderAndInorder2 problem = new ConstructBinaryTreeFromPostorderAndInorder2();

    @Test
    public void test1() {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        TreeNode result = problem.buildTree(inorder, postorder);

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
