package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateLettersTest {
    private final RemoveDuplicateLetters problem = new RemoveDuplicateLetters();

    @Test
    public void test1() {
        String s = "bcabc";

        String result = problem.removeDuplicateLetters(s);

        Assertions.assertThat(result).isEqualTo("abc");
    }

    @Test
    public void test2() {
        String s = "cbacdcbc";

        String result = problem.removeDuplicateLetters(s);

        Assertions.assertThat(result).isEqualTo("acdb");
    }
}
