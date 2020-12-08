package com.olivejua;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 두_정수_사이의_합Test {

    두_정수_사이의_합 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 두_정수_사이의_합();
    }

    @Test
    public void mySolutionTest1() {
        long answer = obj.mySolution(3,5);
        long expectedAnswer = 12;
        assertEquals(answer, expectedAnswer);
    }

    @Test
    public void mySolutionTest2() {
        long answer = obj.mySolution(3,3);
        long expectedAnswer = 3;
        assertEquals(answer, expectedAnswer);
    }

    @Test
    public void mySolutionTest3() {
        long answer = obj.mySolution(5,3);
        long expectedAnswer = 12;
        assertEquals(answer, expectedAnswer);
    }

    @Test
    public void mySolutionTest4() {
        long answer = obj.mySolution(2,7);
        long expectedAnswer = 27;
        assertEquals(answer, expectedAnswer);
    }

    @Test
    public void mySolutionTest5() {
        long answer = obj.mySolution(7,3);
        long expectedAnswer = 25;
        assertEquals(answer, expectedAnswer);
    }


    @Test
    public void betterSolutionTest1() {
        long answer = obj.betterSolution(3,5);
        long expectedAnswer = 12;
        assertEquals(answer, expectedAnswer);
    }

    @Test
    public void betterSolutionTest2() {
        long answer = obj.mySolution(3,3);
        long expectedAnswer = 3;
        assertEquals(answer, expectedAnswer);
    }
}