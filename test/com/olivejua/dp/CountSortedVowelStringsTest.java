package com.olivejua.dp;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountSortedVowelStringsTest {
    private CountSortedVowelStrings problem;

    @Before
    public void setUp() throws Exception {
        problem = new CountSortedVowelStrings();
    }

    @Test
    public void test1() {
        int n = 1;

        int result = problem.countVowelStrings(n);

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test2() {
        int n = 2;

        int result = problem.countVowelStrings(n);

        assertThat(result).isEqualTo(15);
    }

    @Test
    public void test3() {
        int n = 33;

        int result = problem.countVowelStrings(n);

        assertThat(result).isEqualTo(66045);
    }
}
