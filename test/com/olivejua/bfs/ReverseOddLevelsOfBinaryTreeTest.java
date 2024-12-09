package com.olivejua.bfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseOddLevelsOfBinaryTreeTest {
    private final ReverseOddLevelsOfBinaryTree problem = new ReverseOddLevelsOfBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(2,
                new TreeNode(3,
                        new TreeNode(8),
                        new TreeNode(13)),
                new TreeNode(5,
                        new TreeNode(21),
                        new TreeNode(34)));

        TreeNode result = problem.reverseOddLevels2(root);

        assertThat(result.val).isEqualTo(2);
        assertThat(result.left.val).isEqualTo(5);
        assertThat(result.right.val).isEqualTo(3);
        assertThat(result.left.left.val).isEqualTo(8);
        assertThat(result.left.right.val).isEqualTo(13);
        assertThat(result.right.left.val).isEqualTo(21);
        assertThat(result.right.right.val).isEqualTo(34);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(7,
                new TreeNode(13),
                new TreeNode(11));

        TreeNode result = problem.reverseOddLevels2(root);

        assertThat(result.val).isEqualTo(7);
        assertThat(result.left.val).isEqualTo(11);
        assertThat(result.right.val).isEqualTo(13);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(0,
                new TreeNode(1,
                        new TreeNode(0,
                                new TreeNode(1),
                                new TreeNode(1)),
                        new TreeNode(0,
                                new TreeNode(1),
                                new TreeNode(1))),
                new TreeNode(2,
                        new TreeNode(0,
                                new TreeNode(2),
                                new TreeNode(2)),
                        new TreeNode(0,
                                new TreeNode(2),
                                new TreeNode(2))));

        TreeNode result = problem.reverseOddLevels2(root);

        assertThat(result.val).isEqualTo(0);
        assertThat(result.left.val).isEqualTo(2);
        assertThat(result.right.val).isEqualTo(1);
        assertThat(result.left.left.val).isEqualTo(0);
        assertThat(result.left.right.val).isEqualTo(0);
        assertThat(result.right.left.val).isEqualTo(0);
        assertThat(result.right.right.val).isEqualTo(0);
        assertThat(result.left.left.left.val).isEqualTo(2);
        assertThat(result.left.left.right.val).isEqualTo(2);
        assertThat(result.left.right.left.val).isEqualTo(2);
        assertThat(result.left.right.right.val).isEqualTo(2);
        assertThat(result.right.left.left.val).isEqualTo(1);
        assertThat(result.right.left.right.val).isEqualTo(1);
        assertThat(result.right.right.left.val).isEqualTo(1);
        assertThat(result.right.right.right.val).isEqualTo(1);
    }
}
