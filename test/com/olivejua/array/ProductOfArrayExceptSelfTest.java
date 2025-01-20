package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductOfArrayExceptSelfTest {
    private ProductOfArrayExceptSelf problem = new ProductOfArrayExceptSelf();

    @Test
    public void test1() {
        int[] nums = {
                1,2,3,4
        };

        int[] result = problem.productExceptSelf(nums);

        assertThat(result).containsExactly(24,12,8,6);
    }

    @Test
    public void test2() {
        int[] nums = {
                -1,1,0,-3,3
        };

        int[] result = problem.productExceptSelf(nums);

        assertThat(result).containsExactly(0,0,9,0,0);
    }
}