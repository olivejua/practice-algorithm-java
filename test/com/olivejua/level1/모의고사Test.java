package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 모의고사Test {

    public 모의고사 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 모의고사();
    }

    @Test
    public void solution1() {
        int[] answers = {1,2,3,4,5};

        assertArrayEquals(obj.solution(answers), new int[]{1});
    }

    @Test
    public void solution2() {
        int[] answers = {1,3,2,4,2};

        assertArrayEquals(obj.solution(answers), new int[]{1,2,3});
    }

    @Test
    public void solution3() {
        int[] answers = {2,5,1,3,4};

        assertArrayEquals(new int[]{2}, obj.solution(answers));
    }

    @Test
    public void better_solution1() {
        int[] answers = {1,2,3,4,5};

        assertArrayEquals(new int[]{1}, obj.better_solution(answers));
    }

    @Test
    public void better_solution2() {
        int[] answers = {1,3,2,4,2};

        assertArrayEquals(obj.better_solution(answers), new int[]{1,2,3});
    }

    @Test
    public void better_solution3() {
        int[] answers = {2,5,1,3,4};

        assertArrayEquals(obj.better_solution(answers), new int[]{2});
    }
}