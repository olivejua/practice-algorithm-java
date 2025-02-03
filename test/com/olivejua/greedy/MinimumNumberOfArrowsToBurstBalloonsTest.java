package com.olivejua.greedy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumNumberOfArrowsToBurstBalloonsTest {
    private final MinimumNumberOfArrowsToBurstBalloons problem = new MinimumNumberOfArrowsToBurstBalloons();

    @Test
    public void test1() {
        int[][] points = {
                {10,16},
                {2,8},
                {1,6},
                {7,12}
        };

        int result = problem.findMinArrowShots(points);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[][] points = {
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };

        int result = problem.findMinArrowShots(points);

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test3() {
        int[][] points = {
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        };

        int result = problem.findMinArrowShots(points);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test4() {
        int[][] points = {
                {-2147483646,-2147483645},
                {2147483646,2147483647}
        };

        int result = problem.findMinArrowShots(points);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test5() {
        int[][] points = {
                {9,12},
                {1,10},
                {4,11},
                {8,12},
                {3,9},
                {6,9},
                {6,7}
        };

        int result = problem.findMinArrowShots(points);

        assertThat(result).isEqualTo(2);
    }
}
