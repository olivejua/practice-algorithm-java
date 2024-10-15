package com.olivejua.dp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    private final MaximumSubarray problem = new MaximumSubarray();

    @Test
    public void test1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = problem.maxSubArray2(nums);

        Assertions.assertThat(result).isEqualTo(6);
    }
}
