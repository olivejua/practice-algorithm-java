package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 예산Test {

    예산 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 예산();
    }

    @Test
    public void solutionTest1() {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        int expectedAnswer = 3;
        int actualAnswer = obj.solution(d, budget);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void solutionTest2() {
        int[] d = {2,2,3,3};
        int budget = 10;

        int expectedAnswer = 4;
        int actualAnswer = obj.solution(d, budget);

        assertEquals(expectedAnswer, actualAnswer);
    }
}