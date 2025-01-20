package com.olivejua.sort;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {
    private ValidAnagram problem;

    @Before
    public void setUp() throws Exception {
        problem = new ValidAnagram();
    }

    @Test
    public void test1() {
        String s = "anagram";
        String t = "nagaram";

        boolean result = problem.isAnagram(s, t);

        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void test2() {
        String s = "rat";
        String t = "car";

        boolean result = problem.isAnagram(s, t);

        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void test3() {
        String s = "abdc";
        String t = "dbac";

        boolean result = problem.isAnagram(s, t);

        Assertions.assertThat(result).isEqualTo(true);
    }
}