package com.olivejua.dfs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MostStonesRemovedWithSameRowOrColumnTest {
    private MostStoneRemovedWithSameRowOrColumn problem = new MostStoneRemovedWithSameRowOrColumn();

    @Test
    public void test1() {
        int[][] stones = {
                {0,0},
                {0,1},
                {1,0},
                {1,2},
                {2,1},
                {2,2},
        };

        int result = problem.removeStones(stones);

        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void test2() {
        int[][] stones = {
                {0,0},
                {0,2},
                {1,1},
                {2,0},
                {2,2},
        };

        int result = problem.removeStones(stones);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test3() {
        int[][] stones = {
                {0,0},
        };

        int result = problem.removeStones(stones);

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test4() {
        int[][] stones = {
                {0,1},
                {1,0},
                {1,1}
        };

        int result = problem.removeStones(stones);

        Assertions.assertThat(result).isEqualTo(2);
    }
}
