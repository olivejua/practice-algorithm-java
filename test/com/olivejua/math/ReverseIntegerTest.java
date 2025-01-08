package com.olivejua.math;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class ReverseIntegerTest {
    private ReverseInteger problem = new ReverseInteger();

    @Test
    public void test1() {
        int x = -123;

        int result = problem.reverse(x);

        assertThat(result).isEqualTo(-321);
    }

    @Test
    public void test2() {
        int x = 2_147_483_647;

        int result = problem.reverse(x);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test3() {
        int x = -2_147_483_412;

        int result = problem.reverse(x);

        assertThat(result).isEqualTo(-2_143_847_412);
    }

    @Test
    public void test4() {
        int x = -2_147_483_648;

        int result = problem.reverse(x);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void name() {
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
    }
}