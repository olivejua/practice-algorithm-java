package com.olivejua.bitmanipulation;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumNumberOfOperationsToMakeArrayXOREqualToKTest extends TestCase {
    private final MinimumNumberOfOperationsToMakeArrayXOREqualToK problem = new MinimumNumberOfOperationsToMakeArrayXOREqualToK();

    public void test1() {
        int[] nums = {2,1,3,4};
        int k = 1;

        int result = problem.minOperations(nums, k);

        assertThat(result).isEqualTo(2);
    }

    public void test2() {
        int[] nums = {2,0,2,0};
        int k = 0;

        int result = problem.minOperations(nums, k);

        assertThat(result).isEqualTo(0);
    }
}
