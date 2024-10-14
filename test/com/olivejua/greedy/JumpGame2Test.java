package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGame2Test {
    private final JumpGame2 problem = new JumpGame2();

    @Test
    public void test1() {
        int[] nums = {2,3,1,1,4};

        int result = problem.jump(nums);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] nums = {2,3,0,1,4};

        int result = problem.jump(nums);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test3() {
        int[] nums = {0};

        int result = problem.jump(nums);

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test4() {
        int[] nums = {4,2,0,0,1,1,4,4,4,0,4,0};

        int result = problem.jump(nums);

        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void test5() {
        int[] nums = {2,3,1};

        int result = problem.jump(nums);

        Assertions.assertThat(result).isEqualTo(1);
    }
}
