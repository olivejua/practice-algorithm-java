package com.olivejua.string;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters problem = new LongestSubstringWithoutRepeatingCharacters();

    @Before
    public void setUp() throws Exception {
        problem = new LongestSubstringWithoutRepeatingCharacters();
    }

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
        String s = "dvdf";

        int result = problem.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }
}
