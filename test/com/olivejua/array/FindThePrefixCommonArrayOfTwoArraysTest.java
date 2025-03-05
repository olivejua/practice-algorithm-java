package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindThePrefixCommonArrayOfTwoArraysTest {
    private final FindThePrefixCommonArrayOfTwoArrays problem = new FindThePrefixCommonArrayOfTwoArrays();

    @Test
    public void test1() {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};

        int[] result = problem.findThePrefixCommonArray(A, B);

        assertThat(result).containsExactly(0,2,3,4);
    }

    @Test
    public void test2() {
        int[] A = {2,3,1};
        int[] B = {3,1,2};

        int[] result = problem.findThePrefixCommonArray(A, B);

        assertThat(result).containsExactly(0,1,3);
    }
}
