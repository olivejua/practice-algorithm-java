package com.olivejua.dfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfIslandsTest {
    private final NumberOfIslands2 problem = new NumberOfIslands2();

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

    @Test
    public void name() {
        System.out.println(1000 % 300);
    }
}
