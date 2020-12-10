package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 키패드_누르기Test {

    키패드_누르기 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 키패드_누르기();
    }

    @Test
    public void solutionTest1() {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String expectedAnswer = "LRLLLRLLRRL";
        String actualAnswer = obj.solution(numbers, hand);

        System.out.println(actualAnswer);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void solutionTest2() {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        String expectedAnswer = "LRLLRRLLLRR";
        String actualAnswer = obj.solution(numbers, hand);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void solutionTest3() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";

        String expectedAnswer = "LLRLLRLLRL";
        String actualAnswer = obj.solution(numbers, hand);

        assertEquals(expectedAnswer, actualAnswer);
    }
}