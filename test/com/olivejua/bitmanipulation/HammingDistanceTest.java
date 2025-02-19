package com.olivejua.bitmanipulation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HammingDistanceTest {
    private final HammingDistance problem = new HammingDistance();

    @Test
    public void test1() {
        int result = problem.hammingDistance2(1, 4);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int result = problem.hammingDistance2(1, 6);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test3() {
        int x = 6;

        System.out.println((x >> 2));
    }
}
