package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrappingRainWaterTest {
    private final TrappingRainWater PROBLEM = new TrappingRainWater();

    @Test
    public void testSolve1() {
        int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        assertThat(PROBLEM.trap1(input)).isEqualTo(6);
    }
}