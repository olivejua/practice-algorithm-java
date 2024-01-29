package com.olivejua.dfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfIslandsTest {
    private final NumberOfIslands problem = new NumberOfIslands();

    @Test
    public void solve1() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','1'}
        };

        int result = problem.numIslands(grid);

        assertThat(result).isEqualTo(2);
    }
}