package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTree2Test {
    private MaximumDepthOfBinaryTree2 problem = new MaximumDepthOfBinaryTree2();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        int result = problem.maxDepth(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2));

        int result = problem.maxDepth(root);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test3() {
        TreeNode root = null;

        int result = problem.maxDepth(root);

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(0,
                new TreeNode(2,
                        new TreeNode(1,
                                new TreeNode(5),
                                new TreeNode(1)),
                        null),
                new TreeNode(4,
                        new TreeNode(3,
                                null,
                                new TreeNode(6)),
                        new TreeNode(-1,
                                null,
                                new TreeNode(8))));

        int result = problem.maxDepth(root);

        Assertions.assertThat(result).isEqualTo(4);
    }
}
