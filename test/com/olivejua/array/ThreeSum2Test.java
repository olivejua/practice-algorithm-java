package com.olivejua.array;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeSum2Test {
    private final ThreeSum2 problem = new ThreeSum2();

    @Test
    public void test1() {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = problem.threeSum(nums);

        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(-1,-1,2),
                List.of(-1,0,1)
        ));
    }

    @Test
    public void test2() {
        int[] nums = {0,1,1};

        List<List<Integer>> result = problem.threeSum(nums);

        assertThat(result.size()).isEqualTo(0);
        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of());
    }

    @Test
    public void test3() {
        int[] nums = {0,0,0};

        List<List<Integer>> result = problem.threeSum(nums);

        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(0,0,0)
        ));
    }

    @Test
    public void test4() {
        int[] nums = {-2,0,0,2,2};

        List<List<Integer>> result = problem.threeSum(nums);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(-2,0,2)
        ));
    }
}