package com.olivejua;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 문자열_내_마음대로_정렬하기Test {

    문자열_내_마음대로_정렬하기 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 문자열_내_마음대로_정렬하기();
    }

    @Test
    public void mySolutionTest1() {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] expectedAnswer = {"car", "bed", "sun"};
        String[] actualAnswer = obj.mySolution(strings, n);

        assertArrayEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void mySolutionTest2() {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        String[] expectedAnswer = {"abcd", "abce", "cdx"};
        String[] actualAnswer = obj.mySolution(strings, n);

        assertArrayEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void mySolutionTest3() {
        String[] strings = {"apple", "banana", "orange", "fruit"};
        int n = 3;

        String[] expectedAnswer = {"banana", "fruit", "apple", "orange"};
        String[] actualAnswer = obj.mySolution(strings, n);

        assertArrayEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void mySolutionTest4() {
        String[] strings = {"speaker", "monitor", "keyboard", "mouse"};
        int n = 0;

        String[] expectedAnswer = {"keyboard", "monitor", "mouse", "speaker"};
        String[] actualAnswer = obj.mySolution(strings, n);

        assertArrayEquals(actualAnswer, expectedAnswer);
    }

//    @Test
//    public void betterSolution() {
//    }
}