package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestUnivaluePathTest {
    private final LongestUnivaluePath PROBLEM = new LongestUnivaluePath();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(
                5,
                new TreeNode(
                        4,
                        new TreeNode(1),
                        new TreeNode(1)
                ),
                new TreeNode(
                        5,
                        null,
                        new TreeNode(5)
                )
        );

        int result = PROBLEM.longestUnivaluePath(root);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        4,
                        new TreeNode(4),
                        new TreeNode(4)
                ),
                new TreeNode(
                        5,
                        null,
                        new TreeNode(5)
                )
        );

        int result = PROBLEM.longestUnivaluePath(root);

        Assertions.assertThat(result).isEqualTo(2);
    }
}