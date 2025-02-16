package com.olivejua.divideandconquer;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumBinaryTreeTest {
    private final MaximumBinaryTree problem = new MaximumBinaryTree();

    @Test
    public void test1() {
        int[] nums = {3,2,1,6,0,5};

        TreeNode result = problem.constructMaximumBinaryTree(nums);

        Assertions.assertThat(result.val).isEqualTo(6);
        Assertions.assertThat(result.left.val).isEqualTo(3);
        Assertions.assertThat(result.left.left).isEqualTo(null);
        Assertions.assertThat(result.left.right.val).isEqualTo(2);
        Assertions.assertThat(result.left.right.left).isEqualTo(null);
        Assertions.assertThat(result.left.right.right.val).isEqualTo(1);
        Assertions.assertThat(result.right.val).isEqualTo(5);
        Assertions.assertThat(result.right.left.val).isEqualTo(0);
        Assertions.assertThat(result.right.right).isEqualTo(null);
    }
}
