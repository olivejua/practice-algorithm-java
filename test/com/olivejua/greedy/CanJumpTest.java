package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CanJumpTest {
    private final CanJump problem = new CanJump();

    @Test
    public void test1() {
        int[] nums = {2,3,1,1,4};

        boolean result = problem.canJump(nums);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void test2() {
        int[] nums = {3,2,1,0,4};

        boolean result = problem.canJump(nums);

        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void test3() {
        int[] nums = {0};

        boolean result = problem.canJump(nums);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void test4() {
        int[] nums = {1};

        boolean result = problem.canJump(nums);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void test5() {
        int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};

        boolean result = problem.canJump(nums);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void test6() {
        int[] nums = {4,2,0,0,1,1,4,4,4,0,4,0};

        boolean result = problem.canJump(nums);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void test7() {
        int[] nums = {
                8,2,4,4,4,9,5,2,5,8
                ,8,0,8,6,9,1,1,6,3,5
                ,1,2,6,6,0,4,8,6,0,3
                ,2,8,7,6,5,1,7,0,3,4
                ,8,3,5,9,0,4,0,1,0,5
                ,9,2,0,7,0,2,1,0,8,2
                ,5,1,2,3,9,7,4,7,0,0
                ,1,8,5,6,7,5,1,9,9,3
                ,5,0,7,5};

        boolean result = problem.canJump(nums);

        Assertions.assertThat(result).isTrue();
    }
}
