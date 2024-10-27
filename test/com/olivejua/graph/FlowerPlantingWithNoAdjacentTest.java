package com.olivejua.graph;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FlowerPlantingWithNoAdjacentTest {
    private FlowerPlantingWithNoAdjacent problem = new FlowerPlantingWithNoAdjacent();

    @Test
    public void test1() {
        int n = 3;
        int[][] paths = {{1,2}, {2,3}, {3,1}};

        int[] result = problem.gardenNoAdj(n, paths);

        System.out.println(Arrays.toString(result));
        Assertions.assertThat(result).containsExactlyInAnyOrder(1,2,3);
    }

    @Test
    public void test2() {
        int n = 4;
        int[][] paths = {{1,2}, {3,4}};

        int[] result = problem.gardenNoAdj(n, paths);

        System.out.println(Arrays.toString(result));
        Assertions.assertThat(result).containsExactlyInAnyOrder(1,2,1,2);
    }

    @Test
    public void test3() {
        int n = 4;
        int[][] paths = {{1,2}, {2,3}, {3,4}, {4,1}, {1,3}};

        int[] result = problem.gardenNoAdj(n, paths);

        System.out.println(Arrays.toString(result));
        Assertions.assertThat(result).containsExactlyInAnyOrder(1,2,3,4);
    }

    @Test
    public void test4() {
        int n = 1;
        int[][] paths = {};

        int[] result = problem.gardenNoAdj(n, paths);

        System.out.println(Arrays.toString(result));
        Assertions.assertThat(result).containsExactlyInAnyOrder(1);
    }

    @Test
    public void test5() {
        int n = 1000;
        int[][] paths = {{1,2}};

        int[] result = problem.gardenNoAdj(n, paths);

        System.out.println(Arrays.toString(result));
    }
}
