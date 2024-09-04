package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddBoldTagInStringTest {
    private final AddBoldTagInString PROBLEM = new AddBoldTagInString();

    @Test
    public void test1() {
        String targetStr = "abcxyz123";
        String[] dict =  {"abc", "123"};

        String result = PROBLEM.addBoldTag(targetStr, dict);

        assertThat(result).isEqualTo("<b>abc</b>xyz<b>123</b>");
    }

    @Test
    public void test2() {
        String targetStr = "abcxyz123";
        String[] dict =  {"abc", "xyz"};

        String result = PROBLEM.addBoldTag(targetStr, dict);

        assertThat(result).isEqualTo("<b>abcxyz</b>123");
    }

    @Test
    public void test3() {
        String targetStr = "aaabbcc";
        String[] dict =  {"aaa", "aab", "bc"};

        String result = PROBLEM.addBoldTag(targetStr, dict);

        assertThat(result).isEqualTo("<b>aaabbc</b>c");
    }

    @Test
    public void test4() {
        String targetStr = "aaabbccaabc";
        String[] dict =  {"aaa", "aab", "bc"};

        String result = PROBLEM.addBoldTag(targetStr, dict);

        assertThat(result).isEqualTo("<b>aaabbc</b>c<b>aabc</b>");
    }
}
