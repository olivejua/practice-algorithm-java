package com.olivejua.dp;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PartitionArrayForMaximumSumTest {
    private PartitionArrayForMaximumSum problem;

    @Before
    public void setUp() throws Exception {
        problem = new PartitionArrayForMaximumSum();
    }

    @Test
    public void test1() {
        int[] arr = {1,15,7,9,2,5,10};
        int k = 3;

        int result = problem.maxSumAfterPartitioning(arr, k);

        Assertions.assertThat(result).isEqualTo(84);
    }

    @Test
    public void test2() {
        int[] arr = {1,4,1,5,7,3,6,1,9,9,3};
        int k = 4;

        int result = problem.maxSumAfterPartitioning(arr, k);

        Assertions.assertThat(result).isEqualTo(83);
    }

    @Test
    public void test3() {
        int[] arr = {1};
        int k = 1;

        int result = problem.maxSumAfterPartitioning(arr, k);

        Assertions.assertThat(result).isEqualTo(1);
    }
}
