package com.olivejua.array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeTest {
    private GameOfLife problem = new GameOfLife();

    @Test
    public void test1() {
        int[][] board = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };

        problem.gameOfLife(board);

        Assertions.assertThat(board).contains(
                new int[] {0,0,0},
                new int[] {1,0,1},
                new int[] {0,1,1},
                new int[] {0,1,0});
    }
}