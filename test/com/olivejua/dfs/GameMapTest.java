package com.olivejua.dfs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameMapTest {
    private final GameMap PROBLEM = new GameMap();

    @Test
    public void test1() {
        int[][] position = {
                 {1,0,1,1,1}
                ,{1,0,1,0,1}
                ,{1,0,1,1,1}
                ,{1,1,1,0,1}
                ,{0,0,0,0,1}
        };

        int result = PROBLEM.solution(position);
        Assertions.assertThat(result).isEqualTo(11);
    }

    @Test
    public void test2() {
        int[][] position = {
                 {1,0,1,1,1}
                ,{1,0,1,0,1}
                ,{1,0,1,1,1}
                ,{1,1,1,0,0}
                ,{0,0,0,0,1}
        };

        int result = PROBLEM.solution(position);
        Assertions.assertThat(result).isEqualTo(-1);
    }
}