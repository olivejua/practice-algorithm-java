package com.olivejua.dp;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountSquareSubmatricesWithAllOnesTest {
    private CountSquareSubmatricesWithAllOnes problem;

    @Before
    public void setUp() throws Exception {
        problem = new CountSquareSubmatricesWithAllOnes();
    }

    @Test
    public void test1() {
        int[][] matrix = {
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };

        int result = problem.countSquares(matrix);

        assertThat(result).isEqualTo(15);
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {1,0,1},
                {1,1,0},
                {1,1,0}
        };

        int result = problem.countSquares(matrix);

        assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        int[][] matrix = {
                {0,1,1,1,1},
                {1,1,1,1,1},
                {0,1,1,1,1},
                {1,1,1,1,1}
        };

        int result = problem.countSquares(matrix);

        assertThat(result).isEqualTo(32);
    }
}
