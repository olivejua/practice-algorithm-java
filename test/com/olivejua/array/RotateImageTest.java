package com.olivejua.array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class RotateImageTest {
    private final RotateImage problem = new RotateImage();

    @Test
    public void test1() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        problem.rotate(matrix);

        assertThat(matrix).isEqualTo(new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        });
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        problem.rotate(matrix);

        assertThat(matrix).isEqualTo(new int[][]{
                {13,9,5,1},
                {14,10,6,2},
                {15,11,7,3},
                {16,12,8,4},
        });
    }

    @Test
    public void test3() {
        int[][] matrix = {
                {1,2},
                {3,4}
        };

        problem.rotate(matrix);

        assertThat(matrix).isEqualTo(new int[][]{
                {3,1},
                {4,2}
        });
    }

    @Test
    public void test4() {
        int[][] matrix = {
                {1}
        };

        problem.rotate(matrix);

        assertThat(matrix).isEqualTo(new int[][]{
                {1}
        });
    }
}