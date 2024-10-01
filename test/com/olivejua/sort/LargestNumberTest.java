package com.olivejua.sort;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {
    private LargestNumber problem;

    @Before
    public void setUp() throws Exception {
        problem = new LargestNumber();
    }

    @Test
    public void test1() {
        int[] nums = {8, 3, 30, 9, 34};

        String result = problem.largestNumber(nums);

        Assertions.assertThat(result).isEqualTo("9834330");
    }

    @Test
    public void test2() {
        int[] nums = {0, 0};

        String result = problem.largestNumber(nums);

        Assertions.assertThat(result).isEqualTo("0");
    }
}
