package com.olivejua.divideandconquer;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DifferentWaysToAddParenthesesTest {
    DifferentWaysToAddParentheses problem = new DifferentWaysToAddParentheses();

    @Test
    public void test1() {
        List<Integer> result = problem.diffWaysToCompute_memoization("2*6-4*3");

        Assertions.assertThat(result).containsExactlyInAnyOrder(-12, 12, 0, 12, 24);
    }

    @Test
    public void test2() {
        List<Integer> result = problem.diffWaysToCompute_memoization("11");

        Assertions.assertThat(result).containsExactlyInAnyOrder(11);
    }
}
