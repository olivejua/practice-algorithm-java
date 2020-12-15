package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 내적Test {

    내적 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 내적();
    }

    @Test
    public void solutionTest1() {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        int expectedAnswer = 3;
        int actualAnswer = obj.solution(a, b);

        assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void solutionTest2() {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        int expectedAnswer = -2;
        int actualAnswer = obj.solution(a, b);

        assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void solutionTest3() {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        int expectedAnswer = -2;
        int actualAnswer = obj.solution(a, b);

        assertEquals(actualAnswer, expectedAnswer);
    }
}