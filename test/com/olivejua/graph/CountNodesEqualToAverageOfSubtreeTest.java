package com.olivejua.graph;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountNodesEqualToAverageOfSubtreeTest {
    private CountNodesEqualToAverageOfSubtree problem;

    @Before
    public void setUp() throws Exception {
        problem = new CountNodesEqualToAverageOfSubtree();
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(8,
                        new TreeNode(0),
                        new TreeNode(1)),
                new TreeNode(5,
                        null,
                        new TreeNode(6)));

        int result = problem.averageOfSubtree(root);

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);

        int result = problem.averageOfSubtree(root);

        assertThat(result).isEqualTo(1);
    }
}