package com.olivejua.dfs;

import com.olivejua.graph.LetterCombinationOfPhoneNumber;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class LetterCombinationsOfPhoneNumberTest {
    LetterCombinationOfPhoneNumber sut = new LetterCombinationOfPhoneNumber();

    @Test
    public void test1() {
        String input = "24";
        String[] expectedResult = new String[] {"ag", "ah", "ai", "bg", "bh", "bi", "cg", "ch", "ci"};

        List<String> actualResult = sut.letterCombinations(input);

        Assertions.assertThat(actualResult).containsExactlyInAnyOrder(expectedResult);
    }

    @Test
    public void test2() {
        String input = "";
        String[] expectedResult = new String[] {};

        List<String> actualResult = sut.letterCombinations(input);

        Assertions.assertThat(actualResult).containsExactlyInAnyOrder(expectedResult);
    }

    @Test
    public void test3() {
        String input = "2";
        String[] expectedResult = new String[] {"a","b","c"};

        List<String> actualResult = sut.letterCombinations(input);

        Assertions.assertThat(actualResult).containsExactlyInAnyOrder(expectedResult);
    }
}
