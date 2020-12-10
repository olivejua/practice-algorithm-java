package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 문자열_내림차순으로_배치하기Test {

    문자열_내림차순으로_배치하기 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 문자열_내림차순으로_배치하기();
    }

    @Test
    public void solutionTest1() {
        String s = "Zbcdefg";

        String expectedAnswer = "gfedcbZ";
        String actualAnswer = obj.solution(s);

        assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void reverseStrTest1() {
        String s = "Zbcdefg";

        String expectedAnswer = "gfedcbZ";
        String actualAnswer = obj.reverseStr(s);

        assertEquals(actualAnswer, expectedAnswer);
    }
}