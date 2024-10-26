package com.olivejua.graph;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllPathsFromSourceToTargetTest {
    private AllPathsFromSourceToTarget problem = new AllPathsFromSourceToTarget();

    @Test
    public void test1() {
        int[][] graph = {
                {1,2},
                {3},
                {3},
                {}
        };

        List<List<Integer>> result = problem.allPathsSourceTarget(graph);
        Assertions.assertThat(result.size()).isEqualTo(2);
        Assertions.assertThat(result.get(0)).containsExactly(0,1,3);
        Assertions.assertThat(result.get(1)).containsExactly(0,2,3);
    }

    @Test
    public void test2() {
        int[][] graph = {
                {4,3,1},
                {3,2,4},
                {3},
                {4},
                {}
        };

        List<List<Integer>> result = problem.allPathsSourceTarget(graph);
        Assertions.assertThat(result.size()).isEqualTo(5);
        Assertions.assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(0,1,2,3,4),
                List.of(0,1,3,4),
                List.of(0,1,4),
                List.of(0,3,4),
                List.of(0,4)
        ));
    }

    @Test
    public void test3() {
        int[][] graph = {
                {4,3,1},
                {3,2,4},
                {},
                {4},
                {}
        };

        List<List<Integer>> result = problem.allPathsSourceTarget(graph);
        Assertions.assertThat(result.size()).isEqualTo(4);
        Assertions.assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(0,1,3,4),
                List.of(0,1,4),
                List.of(0,3,4),
                List.of(0,4)
        ));
    }
}
