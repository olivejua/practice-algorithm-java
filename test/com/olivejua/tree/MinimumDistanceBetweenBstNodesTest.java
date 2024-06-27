package com.olivejua.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumDistanceBetweenBstNodesTest {
    private MinimumDistanceBetweenBstNodes PROBLEM = new MinimumDistanceBetweenBstNodes();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(10,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(8,
                                new TreeNode(7),
                                null)),
                new TreeNode(16,
                        null,
                        new TreeNode(19)));

        int result = PROBLEM.minDiffInBST(root);

        assertThat(result).isEqualTo(1);
    }
}