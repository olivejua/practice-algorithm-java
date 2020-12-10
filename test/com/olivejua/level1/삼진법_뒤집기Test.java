package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 삼진법_뒤집기Test {

    삼진법_뒤집기 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 삼진법_뒤집기();
    }

    @Test
    public void solutionTest1() {
        int answer = obj.solution(45);
        assertEquals(answer, 7);
    }

    @Test
    public void solutionTest2() {
        int answer = obj.solution(125);
        assertEquals(answer, 229);
    }

    @Test
    public void solutionTest3() {
        int answer = obj.solution(157);
        assertEquals(answer, 133);}
}