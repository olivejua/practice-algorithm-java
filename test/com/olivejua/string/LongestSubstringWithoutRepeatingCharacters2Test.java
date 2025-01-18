package com.olivejua.string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestSubstringWithoutRepeatingCharacters2Test {
    private final LongestSubstringWithoutRepeatingCharacters2 problem = new LongestSubstringWithoutRepeatingCharacters2();

    @Test
    public void test1() {
        String s = "abcabcbb";

        int result = problem.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        String s = "bbbbb";

        int result = problem.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test3() {
        String s = "pwwkew";

        int result = problem.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test4() {
        String s = "   ";

        int result = problem.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test5() {
        String s = "abba";

        int result = problem.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(2);
    }
}