package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConcatenationOfArrayTest {
    private final ConcatenationOfArray problem = new ConcatenationOfArray();

    @Test
    public void test1() {
        int[] nums = {1,2,1};

        int[] result = problem.getConcatenation(nums);

        assertThat(result).containsExactly(1,2,1,1,2,1);
    }

    @Test
    public void test2() {
        int[] nums = {1,3,2,1};

        int[] result = problem.getConcatenation(nums);

        assertThat(result).containsExactly(1,3,2,1,1,3,2,1);
    }
}
