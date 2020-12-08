package com.olivejua;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 나누어_떨어지는_숫자_배열Test {

    나누어_떨어지는_숫자_배열 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 나누어_떨어지는_숫자_배열();
    }

    @Test
    public void solutionTest1() {

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        int[] answer = obj.solution(arr, divisor);
        int[] expectedAnswer = {5, 10};

        assertArrayEquals(answer, expectedAnswer);
    }

    @Test
    public void solutionTest2() {

        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        int[] answer = obj.solution(arr, divisor);
        int[] expectedAnswer = {1, 2, 3, 36};

        assertArrayEquals(answer, expectedAnswer);
    }

    @Test
    public void solutionTest3() {

        int[] arr = {3,2,6};
        int divisor = 10;

        int[] answer = obj.solution(arr, divisor);
        int[] expectedAnswer = {-1};

        assertArrayEquals(answer, expectedAnswer);
    }

    @Test
    public void solutionTest4() {

        int[] arr = {9, 23, 27, 3, 1};
        int divisor = 3;

        int[] answer = obj.solution(arr, divisor);
        int[] expectedAnswer = {3, 9, 27};

        assertArrayEquals(answer, expectedAnswer);
    }

    @Test
    public void solutionTest5() {

        int[] arr = {7, 25, 31, 29, 5};
        int divisor = 2;

        int[] answer = obj.solution(arr, divisor);
        int[] expectedAnswer = {-1};

        assertArrayEquals(answer, expectedAnswer);
    }
}