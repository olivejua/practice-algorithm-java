package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 문자열_다루기_기본Test {

    문자열_다루기_기본 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 문자열_다루기_기본();
    }

    @Test
    public void solutionTest1() {
        String s = "a234";
        boolean expectedAnswer = false;
        boolean actualAnswer = obj.solution(s);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void solutionTest2() {
        String s = "1234";
        boolean expectedAnswer = true;
        boolean actualAnswer = obj.solution(s);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void solutionTest3() {
        String s = "12b502";
        boolean expectedAnswer = false;
        boolean actualAnswer = obj.solution(s);

        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void betterSolutionTest1() {
        String s = "a234";
        boolean expectedAnswer = false;
        boolean actualAnswer = obj.betterSolution(s);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void betterSolutionTest2() {
        String s = "1234";
        boolean expectedAnswer = true;
        boolean actualAnswer = obj.betterSolution(s);

        assertEquals(expectedAnswer, actualAnswer);
    }
}