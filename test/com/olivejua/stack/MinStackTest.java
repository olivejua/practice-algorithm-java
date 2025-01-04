package com.olivejua.stack;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class MinStackTest {
    private MinStack problem;

    @Before
    public void setUp() throws Exception {
        problem = new MinStack2();
    }

    @Test
    public void test1() {
        problem.push(-2);
        problem.push(0);
        problem.push(-3);
        Assertions.assertThat(problem.getMin()).isEqualTo(-3);
        problem.pop();
        Assertions.assertThat(problem.top()).isEqualTo(0);
        Assertions.assertThat(problem.getMin()).isEqualTo(-2);
    }

    @Test
    public void test2() {
        problem.push(3);
        problem.push(5);
        problem.push(1);
        problem.push(2);
        Assertions.assertThat(problem.getMin()).isEqualTo(1);
        problem.pop();
        problem.pop();
        Assertions.assertThat(problem.top()).isEqualTo(5);
        Assertions.assertThat(problem.getMin()).isEqualTo(3);
    }

    @Test
    public void test3() {
        problem.push(0);
        problem.push(1);
        problem.push(0);
        Assertions.assertThat(problem.getMin()).isEqualTo(0);
        problem.pop();
        Assertions.assertThat(problem.getMin()).isEqualTo(0);
    }
}
