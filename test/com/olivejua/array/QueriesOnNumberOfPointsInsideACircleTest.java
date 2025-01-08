package com.olivejua.array;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueriesOnNumberOfPointsInsideACircleTest {
    private QueriesOnNumberOfPointsInsideACircle problem;

    @Before
    public void setUp() throws Exception {
        problem = new QueriesOnNumberOfPointsInsideACircle();
    }

    @Test
    public void test1() {
        int[][] points = {
                {1,3},
                {3,3},
                {5,3},
                {2,2},
        };
        int[][] queries = {
                {2,3,1},
                {4,3,1},
                {1,1,2},
        };

        int[] result = problem.countPoints(points, queries);

        assertThat(result).containsExactly(3,2,2);
    }

    @Test
    public void test2() {
        int[][] points = {
                {1,1},
                {2,2},
                {3,3},
                {4,4},
                {5,5},
        };
        int[][] queries = {
                {1,2,2},
                {2,2,2},
                {4,3,2},
                {4,3,3},
        };

        int[] result = problem.countPoints(points, queries);

        assertThat(result).containsExactly(2,3,2,4);
    }
}