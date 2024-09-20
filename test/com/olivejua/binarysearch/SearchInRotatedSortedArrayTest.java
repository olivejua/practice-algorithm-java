package com.olivejua.binarysearch;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;

public class SearchInRotatedSortedArrayTest {
    private SearchInRotatedSortedArray problem;

    @Before
    public void setUp() throws Exception {
        problem = new SearchInRotatedSortedArray();
    }

    @Test
    public void test1() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int result = problem.search(nums, target);

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;

        int result = problem.search2(nums, target);

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test3() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;

        int result = problem.search(nums, target);

        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test4() {
        int[] nums = {1};
        int target = 0;

        int result = problem.search(nums, target);

        assertThat(result).isEqualTo(-1);
    }
}
