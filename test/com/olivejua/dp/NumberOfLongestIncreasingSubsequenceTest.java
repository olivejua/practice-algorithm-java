package com.olivejua.dp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfLongestIncreasingSubsequenceTest {
    private NumberOfLongestIncreasingSubsequence2 problem = new NumberOfLongestIncreasingSubsequence2();

    @Test
    public void test1() {
        int[] nums = {1,3,5,4,7};

        int result = problem.findNumberOfLIS(nums);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] nums = {2,2,2,2,2};

        int result = problem.findNumberOfLIS(nums);

        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void test3() {
        int[] nums = {1,6,7,8,2,3,4,5};

        int result = problem.findNumberOfLIS(nums);

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test4() {
        int[] nums = {1,2,4,3,5,4,7,2};

        int result = problem.findNumberOfLIS(nums);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test5() {
        int[] nums = {3,1,2};

        int result = problem.findNumberOfLIS(nums);

        Assertions.assertThat(result).isEqualTo(1);
    }
}
