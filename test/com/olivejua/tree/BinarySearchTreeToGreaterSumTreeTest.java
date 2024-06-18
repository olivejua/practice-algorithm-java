package com.olivejua.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTreeToGreaterSumTreeTest {
    private final BinarySearchTreeToGreaterSumTree PROBLEM = new BinarySearchTreeToGreaterSumTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(2,
                                null,
                                new TreeNode(3))),
                new TreeNode(6,
                        new TreeNode(5),
                        new TreeNode(7,
                                null,
                                new TreeNode(9))));

        TreeNode result = PROBLEM.bstToGst(root);

        assertThat(result.val).isEqualTo(31);
        assertThat(result.left.val).isEqualTo(37);
        assertThat(result.right.val).isEqualTo(22);
        assertThat(result.left.left.val).isEqualTo(37);
        assertThat(result.left.right.val).isEqualTo(36);
        assertThat(result.left.right.left).isNull();
        assertThat(result.left.right.right.val).isEqualTo(34);
        assertThat(result.right.left.val).isEqualTo(27);
        assertThat(result.right.right.val).isEqualTo(16);
        assertThat(result.right.right.left).isNull();
        assertThat(result.right.right.right.val).isEqualTo(9);
    }
}