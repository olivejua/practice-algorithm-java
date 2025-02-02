package com.olivejua.dp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EditDistanceTest {
    private final EditDistance problem = new EditDistance();

    @Test
    public void test1() {
        int result = problem.minDistance("horse", "ros");

        assertThat(result).isEqualTo(3);
    }
}
