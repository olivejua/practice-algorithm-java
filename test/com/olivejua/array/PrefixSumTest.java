package com.olivejua.array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class PrefixSumTest {
    private PrefixSum problem = new PrefixSum();

    @Test
    public void test1() {
        int[] arr = {3, 2, 4, 5, 1};

        int[] prefixSum = problem.computePrefixSum(arr);

        assertThat(problem.rangeSum(prefixSum, 1, 3)).isEqualTo(11);
        assertThat(problem.rangeSum(prefixSum, 0, 2)).isEqualTo(9);
    }
}
