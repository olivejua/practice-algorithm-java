package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 비밀지도Test {

    비밀지도 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 비밀지도();
    }

    @Test
    public void solutionTest1() {
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        int n = 6;

        String[] expectedAnswer = {"######", "### #", "## ##", " #### ", " #####", "### # "};
        String[] actualAnswer = obj.solution(n, arr1, arr2);

        assertArrayEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void solutionTest2() {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int n = 5;

        String[] expectedAnswer = {"#####","# # #", "### #", "# ##", "#####"};
        String[] actualAnswer = obj.solution(n, arr1, arr2);

        assertArrayEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void betterSolutionTest1() {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int n = 5;

        obj.betterSolution(n, arr1, arr2);
    }

    @Test
    public void betterSolutionTest2() {
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        int n = 6;

        obj.betterSolution(n, arr1, arr2);
    }
}