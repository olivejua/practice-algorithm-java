package com.olivejua.stack;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class StackSortTest {
    private StackSort problem;

    @Before
    public void setUp() throws Exception {
        problem = new StackSort();
    }

    @Test
    public void test1() {
        problem.push(3);
        problem.push(4);
        assertThat(problem.peek()).isEqualTo(3);
        problem.push(2);
        problem.push(1);
        assertThat(problem.pop()).isEqualTo(1);
        problem.push(5);
        assertThat(problem.pop()).isEqualTo(2);
        assertThat(problem.isEmpty()).isEqualTo(false);
    }
}