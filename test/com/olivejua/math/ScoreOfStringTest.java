package com.olivejua.math;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreOfStringTest {
    private final ScoreOfString problem = new ScoreOfString();

    @Test
    public void test1() {
        String s = "hello";
        int result = problem.scoreOfString(s);
        assertThat(result).isEqualTo(13);
    }

    @Test
    public void test2() {
        String s = "zaz";
        int result = problem.scoreOfString(s);
        assertThat(result).isEqualTo(50);
    }
}
