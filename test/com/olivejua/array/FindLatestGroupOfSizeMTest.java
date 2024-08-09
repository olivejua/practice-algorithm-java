package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLatestGroupOfSizeMTest {
    private final FindLatestGroupOfSizeM PROBLEM = new FindLatestGroupOfSizeM();

    @Test
    public void test1() {
        int[] arr = new int[] {3,5,1,2,4};
        int m = 1;

        int result = PROBLEM.findLatestStep(arr, m);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] arr = new int[] {3,1,5,4,2};
        int m = 2;

        int result = PROBLEM.findLatestStep(arr, m);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test3() {
        int[] arr = new int[] {4,6,2,3,5,1};
        int m = 6;

        int result = PROBLEM.findLatestStep(arr, m);
        assertThat(result).isEqualTo(6);
    }
}