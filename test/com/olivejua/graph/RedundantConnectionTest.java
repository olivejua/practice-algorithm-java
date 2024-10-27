package com.olivejua.graph;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedundantConnectionTest {
    private final RedundantConnection2 problem = new RedundantConnection2();

    @Test
    public void test1() {
        int[][] edges = {
                {1,2},
                {1,3},
                {2,3}
        };

        int[] result = problem.findRedundantConnection(edges);

        Assertions.assertThat(result).containsExactly(2,3);
    }

    @Test
    public void test2() {
        int[][] edges = {
                {1,2},
                {2,3},
                {3,4},
                {1,4},
                {1,5}
        };

        int[] result = problem.findRedundantConnection(edges);

        Assertions.assertThat(result).containsExactly(1,4);
    }

    @Test
    public void test3() {
        int[][] edges = {
                {1,4},
                {3,4},
                {1,3},
                {1,2},
                {4,5}
        };

        int[] result = problem.findRedundantConnection(edges);

        Assertions.assertThat(result).containsExactly(1,3);
    }

    @Test
    public void test4() {
        int[][] edges = {
                {1,3},
                {3,4},
                {1,5},
                {3,5},
                {2,3}
        };

        int[] result = problem.findRedundantConnection(edges);

        Assertions.assertThat(result).containsExactly(3,5);
    }

    @Test
    public void test5() {
        int[][] edges = {
                {1,5},
                {3,4},
                {3,5},
                {4,5},
                {2,4}
        };

        int[] result = problem.findRedundantConnection(edges);

        Assertions.assertThat(result).containsExactly(4,5);
    }

    @Test
    public void test6() {
        int[][] edges = {{21,22},{4,7},{12,13},{13,25},{12,15},{17,23},{15,16},{8,21},{23,24},{3,9},{19,21},{13,21},{4,10},{5,6},{1,20},{10,16},{1,4},{10,14},{5,20},{1,2},{3,24},{2,11},{11,24},{24,25},{17,18}};

        int[] result = problem.findRedundantConnection(edges);

        Assertions.assertThat(result).containsExactly(24,25);
    }

    @Test
    public void test7() {
        int[][] edges = {{16,25},{7,9},{3,24},{10,20},{15,24},{2,8},{19,21},{2,15},{13,20},{5,21},{7,11},{6,23},{7,16},{1,8},{17,20},{4,19},{11,22},{5,11},{1,16},{14,20},{1,4},{22,23},{12,20},{15,18},{12,16}};

        int[] result = problem.findRedundantConnection(edges);

        Assertions.assertThat(result).containsExactly(1,4);
    }
}
