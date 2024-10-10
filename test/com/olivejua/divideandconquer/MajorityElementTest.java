package com.olivejua.divideandconquer;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {
    private MajorityElement problem = new MajorityElement();

    @Test
    public void test1() {
        int[] nums = {3,2,3};

        int result = problem.majorityElement(nums);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        int[] nums = {2,2,1,1,3,2,2};

        int result = problem.majorityElement(nums);

        Assertions.assertThat(result).isEqualTo(2);
    }
}
