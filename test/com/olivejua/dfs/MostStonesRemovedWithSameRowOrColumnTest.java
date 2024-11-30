package com.olivejua.dfs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MostStonesRemovedWithSameRowOrColumnTest {
    private MostStonesRemovedWithSameRowOrColumn problem = new MostStonesRemovedWithSameRowOrColumn();

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
}
