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
}
