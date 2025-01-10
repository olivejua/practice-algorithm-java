package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusOneTest {
    private final PlusOne problem = new PlusOne();

    @Test
    public void test1() {
        int[] digits = {4,3,2,1};

        int[] result = problem.plusOne(digits);

        assertThat(result).containsExactly(4,3,2,2);
    }

    @Test
    public void test2() {
        int[] digits = {1,2,3};

        int[] result = problem.plusOne(digits);

        assertThat(result).containsExactly(1,2,4);
    }

    @Test
    public void test3() {
        int[] digits = {9};

        int[] result = problem.plusOne(digits);

        assertThat(result).containsExactly(1,0);
    }

    @Test
    public void test4() {
        int[] digits = {1,4,9};

        int[] result = problem.plusOne(digits);

        assertThat(result).containsExactly(1,5,0);
    }

    @Test
    public void name() {
        System.out.println((9 + 1) % 10 == 0);
    }
}