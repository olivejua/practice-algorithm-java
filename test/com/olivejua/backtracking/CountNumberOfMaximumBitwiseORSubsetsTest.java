package com.olivejua.backtracking;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountNumberOfMaximumBitwiseORSubsetsTest {
    private final CountNumberOfMaximumBitwiseORSubsets problem = new CountNumberOfMaximumBitwiseORSubsets();

    @Test
    public void test1() {
        int[] nums = {
                3,1
        };

        int result = problem.countMaxOrSubsets(nums);

        assertThat(result).isEqualTo(2);
    }
}
