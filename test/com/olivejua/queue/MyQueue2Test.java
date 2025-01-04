package com.olivejua.queue;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MyQueue2Test {
    private MyQueue2 problem;

    @Test
    public void test1() {
        problem = new MyQueue2();

        problem.push(1);
        problem.push(2);
        assertThat(problem.peek()).isEqualTo(1);
        assertThat(problem.pop()).isEqualTo(1);
        assertThat(problem.empty()).isEqualTo(false);
    }
}