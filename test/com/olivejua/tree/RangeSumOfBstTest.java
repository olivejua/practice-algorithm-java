package com.olivejua.tree;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeSumOfBstTest {
    private RangeSumOfBst PROBLEM;

    @Before
    public void setUp() throws Exception {
        PROBLEM = new RangeSumOfBst();
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3),
                        new TreeNode(6)),
                new TreeNode(15,
                        null,
                        new TreeNode(18)));
        int low = 6;
        int high = 15;

        int result = PROBLEM.rangeSumBST(root, low, high);

        assertThat(result).isEqualTo(31);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(1),
                                null),
                        new TreeNode(7,
                                new TreeNode(6),
                                null)),
                new TreeNode(15,
                        new TreeNode(13),
                        new TreeNode(18)));
        int low = 6;
        int high = 10;

        int result = PROBLEM.rangeSumBST(root, low, high);

        assertThat(result).isEqualTo(23);
    }
}