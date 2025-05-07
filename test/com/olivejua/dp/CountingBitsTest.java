package com.olivejua.dp;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBitsTest {
    private CountingBits problem;

    @Before
    public void setUp() throws Exception {
        problem = new CountingBits();
    }

    @Test
    public void test1() {
        int n = 2;

        int[] result = problem.countBits(n);

        Assertions.assertThat(result).containsExactly(0,1,1);
    }

    @Test
    public void test2() {
        int n = 5;

        int[] result = problem.countBits(n);

        Assertions.assertThat(result).containsExactly(0,1,1,2,1,2);
    }
}
