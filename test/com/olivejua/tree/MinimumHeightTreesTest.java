package com.olivejua.tree;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumHeightTreesTest {
    private final MinimumHeightTrees PROBLEM = new MinimumHeightTrees();

    @Test
    public void test1() {
        int n = 7;
        int[][] edges = {
                {0, 3},
                {1, 3},
                {2, 3},
                {4, 3},
                {5, 3},
                {6, 5}
        };

        List<Integer> result = PROBLEM.findMinHeightTrees2(n, edges);

        //3 또는 5가 루트가 될 경우 최대 높이가 2인 트리가 된다
        assertThat(result).containsExactlyInAnyOrder(3, 5);
    }

    @Test
    public void test2() {
        int n = 10;
        int[][] edges = {
                {0, 2},
                {1, 2},
                {2, 3},
                {2, 4},
                {3, 5},
                {5, 9},
                {4, 6},
                {4, 7},
                {7, 8}
        };

        List<Integer> result = PROBLEM.findMinHeightTrees2(n, edges);

        //2가 루트가 될 경우 최대 높이가 3인 트리가 된다
        assertThat(result).containsExactlyInAnyOrder(2);
    }

    @Test
    public void test3() {
        int n = 6;
        int[][] edges = {{3,0},{3,1},{3,2},{3,4},{5,4}};

        List<Integer> result = PROBLEM.findMinHeightTrees2(n, edges);
        assertThat(result).containsExactlyInAnyOrder(3, 4);
    }

    @Test
    public void test4() {
        int n = 1;
        int[][] edges = {};

        List<Integer> result = PROBLEM.findMinHeightTrees2(n, edges);
        assertThat(result).containsExactlyInAnyOrder(0);
    }
}