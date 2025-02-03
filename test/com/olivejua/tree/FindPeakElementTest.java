package com.olivejua.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindPeakElementTest {
    private final FindPeakElement problem = new FindPeakElement();

    @Test
    public void test1() {
        int[] nums = {1,2,3,1};

        int result = problem.findPeakElement(nums);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] nums = {1,2,1,3,5,6,4};

        int result = problem.findPeakElement(nums);

        assertThat(result == 1 || result == 5).isTrue();
    }
}
