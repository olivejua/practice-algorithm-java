package com.olivejua.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvertBinaryTreeTest {
    private final InvertBinaryTree PROBLEM = new InvertBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(
                4,
                new TreeNode(
                        2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(
                        7,
                        new TreeNode(6),
                        new TreeNode(9)
                )
        );

        TreeNode result = PROBLEM.invertTree3(root);

        assertThat(result).isNotNull();
        assertThat(result.val).isEqualTo(4);

        TreeNode leftNode = result.left;
        assertThat(leftNode.val).isEqualTo(7);
        assertThat(leftNode.left.val).isEqualTo(9);
        assertThat(leftNode.right.val).isEqualTo(6);

        TreeNode rightNode = result.right;
        assertThat(rightNode.val).isEqualTo(2);
        assertThat(rightNode.left.val).isEqualTo(3);
        assertThat(rightNode.right.val).isEqualTo(1);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(
                2,
                new TreeNode(
                        1
                ),
                new TreeNode(
                        3
                )
        );

        TreeNode result = PROBLEM.invertTree3(root);

        assertThat(result).isNotNull();
        assertThat(result.val).isEqualTo(2);

        TreeNode leftNode = result.left;
        assertThat(leftNode.val).isEqualTo(3);

        TreeNode rightNode = result.right;
        assertThat(rightNode.val).isEqualTo(1);
    }

    @Test
    public void test3() {
        TreeNode result = PROBLEM.invertTree3(null);

        assertThat(result).isNull();
    }
}