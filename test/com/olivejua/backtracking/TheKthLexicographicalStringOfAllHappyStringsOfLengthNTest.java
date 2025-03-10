package com.olivejua.backtracking;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheKthLexicographicalStringOfAllHappyStringsOfLengthNTest {
    private final TheKthLexicographicalStringOfAllHappyStringsOfLengthN problem = new TheKthLexicographicalStringOfAllHappyStringsOfLengthN();

    @Test
    public void test1() {
        int n = 1;
        int k = 3;

        String result = problem.getHappyString(n, k);

        Assertions.assertThat(result).isEqualTo("c");
    }

    @Test
    public void test2() {
        int n = 1;
        int k = 4;

        String result = problem.getHappyString(n, k);

        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    public void test3() {
        int n = 3;
        int k = 9;

        String result = problem.getHappyString(n, k);

        Assertions.assertThat(result).isEqualTo("cab");
    }
}
