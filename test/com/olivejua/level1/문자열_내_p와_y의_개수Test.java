package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 문자열_내_p와_y의_개수Test {

    문자열_내_p와_y의_개수 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 문자열_내_p와_y의_개수();
    }

    @Test
    public void solutionTest1() {
        String s = "pPoooyY";
        boolean expectedAnswer = true;
        boolean actualAnswer = obj.solution(s);

        assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void solutionTest2() {
        String s = "Pyy";
        boolean expectedAnswer = false;
        boolean actualAnswer = obj.solution(s);

        assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void solutionTest3() {
        String s = "PuppywhyY";
        boolean expectedAnswer = true;
        boolean actualAnswer = obj.solution(s);

        assertEquals(actualAnswer, expectedAnswer);
    }
}