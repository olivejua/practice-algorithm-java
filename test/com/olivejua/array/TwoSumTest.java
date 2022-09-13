package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {
    private final TwoSum PROBLEM = new TwoSum();

    @Test
    public void testResolve1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] actualResult = PROBLEM.solve1(nums, target);
        assertThat(actualResult).containsExactlyInAnyOrder(0, 1);
    }

    @Test
    public void testResolve2() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] actualResult = PROBLEM.solve2(nums, target);
        assertThat(actualResult).containsExactlyInAnyOrder(0, 1);
    }
}