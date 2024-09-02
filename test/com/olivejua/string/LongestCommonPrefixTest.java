package com.olivejua.string;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LongestCommonPrefixTest {
    private final LongestCommonPrefix PROBLEM = new LongestCommonPrefix();

    @Test
    public void test1() {
        String[] strs = {"flower","flow","flight"};

        String result = PROBLEM.longestCommonPrefix(strs);
        Assertions.assertThat(result).isEqualTo("fl");
    }

    @Test
    public void test2() {
        String[] strs = {"dog","racecar","car"};

        String result = PROBLEM.longestCommonPrefix(strs);
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    public void test3() {
        String[] strs = {"technically", "technic", "technology", "technical"};

        String result = PROBLEM.longestCommonPrefix(strs);
        Assertions.assertThat(result).isEqualTo("techn");
    }

    @Test
    public void name() {
        String str = "abc";

        System.out.println(str.charAt(2));
    }
}
