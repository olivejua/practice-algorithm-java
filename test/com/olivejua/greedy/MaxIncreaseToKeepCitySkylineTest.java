package com.olivejua.greedy;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaxIncreaseToKeepCitySkylineTest {
    private final MaxIncreaseToKeepCitySkyline problem = new MaxIncreaseToKeepCitySkyline();

    @Test
    public void test1() {
        int[][] grid = {
                {3,0,8,4},
                {2,4,5,7},
                {9,2,6,3},
                {0,3,1,0}
        };

        int result = problem.maxIncreaseKeepingSkyline(grid);

        Assertions.assertThat(result).isEqualTo(35);
    }
}
