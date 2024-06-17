package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {
    private final BalancedBinaryTree PROBLEM = new BalancedBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        boolean result = PROBLEM.isBalanced(root);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));

        boolean result = PROBLEM.isBalanced(root);

        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void test3() {
        boolean result = PROBLEM.isBalanced(null);

        Assertions.assertThat(result).isTrue();
    }
}