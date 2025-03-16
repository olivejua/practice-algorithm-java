package com.olivejua.bitmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MaximumXORForEachQueryTest {
    private final MaximumXORForEachQuery problem = new MaximumXORForEachQuery();

    @Test
    public void test1(){
        int[] nums = {0,1,1,3};
        int maximumBit = 2;

        int[] result = problem.getMaximumXor(nums, maximumBit);

        assertThat(result).containsExactly(0,3,2,3);
    }

    @Test
    public void test2(){
        int[] nums = {2,3,4,7};
        int maximumBit = 3;

        int[] result = problem.getMaximumXor(nums, maximumBit);

        assertThat(result).containsExactly(5,2,6,5);
    }
}
