package com.olivejua.dp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {
    FibonacciNumber problem = new FibonacciNumber();

    @Test
    public void test1() {
        int result = problem.fib(2);

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test2() {
        int result = problem.fib(3);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test3() {
        int result = problem.fib(4);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test4() {
        int result = problem.fib(2);

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test5() {
        int result = problem.fib(3);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test6() {
        int result = problem.fib(4);

        Assertions.assertThat(result).isEqualTo(3);
    }
}
