package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumMovesToReachTargetScoreTest {
    private MinimumMovesToReachTargetScore problem = new MinimumMovesToReachTargetScore();

    @Test
    public void test1() {
        int target = 5;
        int maxDoubles = 0;

        int result = problem.minMoves(target, maxDoubles);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        int target = 19;
        int maxDoubles = 2;

        int result = problem.minMoves(target, maxDoubles);

        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        int target = 10;
        int maxDoubles = 4;

        int result = problem.minMoves(target, maxDoubles);

        Assertions.assertThat(result).isEqualTo(4);
    }
}
