package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BalanceABinarySearchTreeTest {
    private final BalanceABinarySearchTree problem = new BalanceABinarySearchTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                null,
                                new TreeNode(4,
                                        null,
                                        null))));

        TreeNode result = problem.balanceBST(root);

        Assertions.assertThat(result.val).isEqualTo(2);
        Assertions.assertThat(result.left.val).isEqualTo(1);
        Assertions.assertThat(result.right.val).isEqualTo(3);
        Assertions.assertThat(result.right.right.val).isEqualTo(4);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        TreeNode result = problem.balanceBST(root);

        Assertions.assertThat(result.val).isEqualTo(2);
        Assertions.assertThat(result.left.val).isEqualTo(1);
        Assertions.assertThat(result.right.val).isEqualTo(3);
    }
}
