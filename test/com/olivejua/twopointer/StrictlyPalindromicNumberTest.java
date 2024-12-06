package com.olivejua.twopointer;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class StrictlyPalindromicNumberTest {
    private final StrictlyPalindromicNumber problem = new StrictlyPalindromicNumber();

    @Test
    public void test1() {
        int n = 9;

        boolean result = problem.isStrictlyPalindromic(n);

        assertThat(result).isFalse();
    }

    @Test
    public void test2() {
        int n = 4;

        boolean result = problem.isStrictlyPalindromic(n);

        assertThat(result).isFalse();
    }

    @Test
    public void test3() {
        int n = 31;

        boolean result = problem.isStrictlyPalindromic(n);

        assertThat(result).isFalse();
    }

}
