package com.olivejua.dfs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindChampionIITest {
    private final FindChampionII problem = new FindChampionII();

    @Test
    public void test1() {
        int n = 3;
        int[][] edges = {
                {0,1},
                {1,2}
        };

        int result = problem.findChampion(n, edges);

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test2() {
        int n = 4;
        int[][] edges = {
                {0,2},
                {1,3},
                {1,2}
        };

        int result = problem.findChampion(n, edges);

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test3() {
        int n = 1;
        int[][] edges = {
        };

        int result = problem.findChampion(n, edges);

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test4() {
        int n = 2;
        int[][] edges = {
        };

        int result = problem.findChampion(n, edges);

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test5() {
        int n = 3;
        int[][] edges = {
                {0,1}
        };

        int result = problem.findChampion(n, edges);

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test6() {
        int n = 2;
        int[][] edges = {
                {1,0}
        };

        int result = problem.findChampion(n, edges);

        Assertions.assertThat(result).isEqualTo(1);
    }
}
