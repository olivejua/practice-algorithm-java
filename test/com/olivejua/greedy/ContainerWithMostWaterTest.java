package com.olivejua.greedy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainerWithMostWaterTest {
    private final ContainerWithMostWater problem = new ContainerWithMostWater();

    @Test
    public void test1() {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = problem.maxArea(height);

        assertThat(result).isEqualTo(49);
    }

    @Test
    public void test2() {
        int[] height = {1,1};

        int result = problem.maxArea(height);

        assertThat(result).isEqualTo(1);
    }
}
