package com.olivejua.string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromicSubstringsTest {
    private PalindromicSubstrings problem = new PalindromicSubstrings();

    @Test
    public void test1() {
        String s = "acca";

        int result = problem.countSubstrings(s);

        assertThat(result).isEqualTo(6);
    }
}