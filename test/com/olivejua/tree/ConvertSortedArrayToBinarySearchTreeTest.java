package com.olivejua.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertSortedArrayToBinarySearchTreeTest {
    private final ConvertSortedArrayToBinarySearchTree PROBLEM = new ConvertSortedArrayToBinarySearchTree();

    @Test
    public void test1() {
        int[] nums = {-10,-3,0,5,9};

        TreeNode result = PROBLEM.sortedArrayToBST(nums);

        assertThat(result.val).isEqualTo(0);

        assertThat(result.left.val).isEqualTo(-3);
        assertThat(result.right.val).isEqualTo(9);

        assertThat(result.left.left.val).isEqualTo(-10);
        assertThat(result.left.right).isNull();

        assertThat(result.right.left.val).isEqualTo(5);
        assertThat(result.right.right).isNull();
    }

    @Test
    public void test2() {
        int[] nums = {1,3};

        TreeNode result = PROBLEM.sortedArrayToBST(nums);

        assertThat(result.val).isEqualTo(3);
        assertThat(result.left.val).isEqualTo(1);
        assertThat(result.right).isNull();
    }

}