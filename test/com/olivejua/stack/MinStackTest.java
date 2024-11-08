package com.olivejua.stack;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {
    private MinStack problem;

    @Before
    public void setUp() throws Exception {
        problem = new MinStack();
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
}
