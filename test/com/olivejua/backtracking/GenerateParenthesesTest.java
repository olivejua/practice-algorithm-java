package com.olivejua.backtracking;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {
    private GenerateParentheses problem = new GenerateParentheses();

    @Test
    public void test1() {
        List<String> result = problem.generateParenthesis(3);

        Assertions.assertThat(result)
                .containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()");
    }
}
