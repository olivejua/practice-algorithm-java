package com.olivejua.array;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {
    private LongestConsecutiveSequence problem;

    @Before
    public void setUp() throws Exception {
        problem = new LongestConsecutiveSequence();
    }

    @Test
    public void test1() {
        int[] nums = {100,4,200,1,3,2};

        int result = problem.longestConsecutive(nums);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        int result = problem.longestConsecutive(nums);

        Assertions.assertThat(result).isEqualTo(9);
    }
}