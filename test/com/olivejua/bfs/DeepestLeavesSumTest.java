package com.olivejua.bfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeepestLeavesSumTest {
    private final DeepestLeavesSum problem = new DeepestLeavesSum();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(7),
                                null),
                        new TreeNode(5)),
                new TreeNode(3,
                        null,
                        new TreeNode(6,
                                null,
                                new TreeNode(8)))
        );

        int result = problem.deepestLeavesSum(root);

        assertThat(result).isEqualTo(15);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(
                6,
                new TreeNode(7,
                        new TreeNode(2,
                                new TreeNode(9),
                                null),
                        new TreeNode(7,
                                new TreeNode(1),
                                new TreeNode(4))),
                new TreeNode(8,
                        new TreeNode(1),
                        new TreeNode(3,
                                null,
                                new TreeNode(5)))
        );

        int result = problem.deepestLeavesSum(root);

        assertThat(result).isEqualTo(19);
    }
}
