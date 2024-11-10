package com.olivejua.stack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class RemoveDuplicateLettersTest2 {
    private final RemoveDuplicateLetters problem = new RemoveDuplicateLetters();

    @Test
    public void test1() {
        String s = "bcabc";

        String result = problem.removeDuplicateLetters(s);

        assertThat(result).isEqualTo("abc");
    }

    @Test
    public void test2() {
        String s = "cbacdcbc";

        String result = problem.removeDuplicateLetters(s);

        assertThat(result).isEqualTo("acdb");
    }

    @Test
    public void test3() {
        String s = "bbcaac";

        String result = problem.removeDuplicateLetters(s);

        assertThat(result).isEqualTo("bac");
    }
}
