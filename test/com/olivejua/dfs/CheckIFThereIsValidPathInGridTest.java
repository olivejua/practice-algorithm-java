package com.olivejua.dfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckIFThereIsValidPathInGridTest {
    private final CheckIFThereIsValidPathInGrid PROBLEM = new CheckIFThereIsValidPathInGrid();

    @Test
    public void test1() {
        int[][] grid = new int[][] {
                {2, 4, 3},
                {6, 5, 2}
        };

        boolean result = PROBLEM.hasValidPath(grid);
        assertThat(result).isTrue();
    }

    @Test
    public void test2() {
        int[][] grid = new int[][] {
                {1, 2, 1},
                {1, 2, 1}
        };

        boolean result = PROBLEM.hasValidPath(grid);
        assertThat(result).isFalse();
    }

    @Test
    public void test3() {
        int[][] grid = new int[][] {
                {1, 1, 2}
        };

        boolean result = PROBLEM.hasValidPath(grid);
        assertThat(result).isFalse();
    }
}