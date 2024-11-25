package com.olivejua.dfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoudAndRichTest {
    private final LoudAndRich problem = new LoudAndRich();

    @Test
    public void test1() {
        int[][] richer = {
                {1,0},
                {2,1},
                {3,1},
                {3,7},
                {4,3},
                {5,3},
                {6,3},
        };

        int[] quiet = {3,2,5,4,6,1,7,0};

        int[] result = problem.loudAndRich(richer, quiet);

        assertThat(result).containsExactly(5,5,2,5,4,5,6,7);
    }

    @Test
    public void test2() {
        int[][] richer = {};

        int[] quiet = {0};

        int[] result = problem.loudAndRich(richer, quiet);

        assertThat(result).containsExactly(0);
    }

    @Test
    public void test3() {
        int[][] richer = {};

        int[] quiet = {1,0};

        int[] result = problem.loudAndRich(richer, quiet);

        assertThat(result).containsExactly(0,1);
    }
}
