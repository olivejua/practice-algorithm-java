package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayPartitionTest {
    private final ArrayPartition problem = new ArrayPartition();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test1() {
        int[] nums = {6,2,6,5,1,2};

        int result = problem.arrayPairSum(nums);

        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    public void test2() {
        int[] nums = {1,4,3,2};

        int result = problem.arrayPairSum(nums);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test3() {
        int[] nums = {0,-1};

        int result = problem.arrayPairSum(nums);

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test4() {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        int result = problem.arrayPairSum(nums);

        Assertions.assertThat(result).isEqualTo(64);
    }
}
