package com.olivejua.array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class SetMatrixZerosTest {
    private final SetMatrixZeros problem = new SetMatrixZeros();

    @Test
    public void test1() {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        problem.setZeroes(matrix);

        assertThat(matrix).isEqualTo(new int[][]{
                {1,0,1},
                {0,0,0},
                {1,0,1}
        });
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        problem.setZeroes(matrix);

        assertThat(matrix).isEqualTo(new int[][]{
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
        });
    }
}