package com.olivejua.bitmanipulation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Leetcode_1442Test {
    private final Leetcode_1442 problem = new Leetcode_1442();

    @Test
    public void test1() {
        int[] arr = {2,3,1,6,7};

        int result = problem.countTriplets(arr);

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] arr = {1,1,1,1,1};

        int result = problem.countTriplets(arr);

        assertThat(result).isEqualTo(10);
    }
}
