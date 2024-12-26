package com.olivejua.greedy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumDistanceInArraysTest {
    private final MaximumDistanceInArrays problem = new MaximumDistanceInArrays();

    @Test
    public void test1() {
        List<List<Integer>> arrays = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(1, 2, 3));

        int result = problem.maxDistance(arrays);

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        List<List<Integer>> arrays = List.of(List.of(1), List.of(1));

        int result = problem.maxDistance(arrays);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test3() {
        List<List<Integer>> arrays = List.of(
                List.of(-8,-7,-7,-5,1,1,3,4),
                List.of(-2),
                List.of(-10,-10,-7,0,1,3),
                List.of(2));

        int result = problem.maxDistance(arrays);

        assertThat(result).isEqualTo(14);
    }

    @Test
    public void test4() {
        List<List<Integer>> arrays = List.of(
                List.of(1,5),
                List.of(3,4));

        int result = problem.maxDistance(arrays);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test5() {
        List<List<Integer>> arrays = List.of(
                List.of(-10,-9,-9,-9,-7,-2,-1,2,4),
                List.of(-9,-7,-6,-6,-3,0,1,3),
                List.of(-10,-9,-2,-1,1,3));

        int result = problem.maxDistance(arrays);

        assertThat(result).isEqualTo(14);
    }


}