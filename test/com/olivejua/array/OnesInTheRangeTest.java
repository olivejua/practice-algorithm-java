package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OnesInTheRangeTest {
    private OnesInTheRange problem;

    @Test
    public void test1() {
        int[] arr = new int[]{0, 0, 1, 0, 1};
        problem = new OnesInTheRange(arr);

        int result = problem.numOfOnes(2, 4);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] arr = new int[]{0, 1, 1, 0, 0, 1, 1, 1};
        problem = new OnesInTheRange(arr);

        int result = problem.numOfOnes(2, 6);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test3() {
        int[] arr = new int[]{0, 1, 1, 0, 0, 1, 1, 1};
        problem = new OnesInTheRange(arr);

        int result = problem.numOfOnes(1, 7);

        assertThat(result).isEqualTo(5);
    }
}
