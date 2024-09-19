package com.olivejua.binarysearch;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LCBinarySearchTest {

    private LCBinarySearch problem;

    @Before
    public void setUp() throws Exception {
        problem = new LCBinarySearch();
    }

    @Test
    public void test1() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int result = problem.search(nums, target);

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;

        int result = problem.search(nums, target);

        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test3() {
        int[] nums = {2,5};
        int target = 2;

        int result = problem.search(nums, target);

        assertThat(result).isEqualTo(0);
    }
}
