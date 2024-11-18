package com.olivejua.dp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MaximumSumCircularSubarrayTest {
    private final MaximumSumCircularSubarray problem = new MaximumSumCircularSubarray();

    @Test
    public void test1() {
        int[] nums = {1, -2, 3, -2};

        int result = problem.maxSubarraySumCircular(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        int[] nums = {5, -3, 5};

        int result = problem.maxSubarraySumCircular(nums);

        assertThat(result).isEqualTo(10);
    }

    @Test
    public void test3() {
        int[] nums = {-3, -2, -3};

        int result = problem.maxSubarraySumCircular(nums);

        assertThat(result).isEqualTo(-2);
    }

    @Test
    public void test4() {
        int[] nums = {-9,14,24,-14,12,18,-18,-10,-10,-23,-2,-23,11,12,18,-9,9,-29,12,4,-8,15,11,-12,-16,-9,19,-12,22,16};

        int result = problem.maxSubarraySumCircular(nums);

        assertThat(result).isEqualTo(99);
    }
}
