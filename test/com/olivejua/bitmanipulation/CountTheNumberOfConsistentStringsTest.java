package com.olivejua.bitmanipulation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountTheNumberOfConsistentStringsTest {
    private final CountTheNumberOfConsistentStrings problem = new CountTheNumberOfConsistentStrings();

    @Test
    public void test1() {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        int result = problem.countConsistentStrings(allowed, words);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};

        int result = problem.countConsistentStrings(allowed, words);

        assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};

        int result = problem.countConsistentStrings(allowed, words);

        assertThat(result).isEqualTo(4);
    }
}
