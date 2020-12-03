package com.olivejua;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class 체육복Test {

    체육복 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 체육복();
    }

    @Test
    public void test1_solution1() {
        int n = 5;
        int[] lost = {2,4};
        int[] reverse = {1,3,5};

        int answer = obj.solution1(n, lost, reverse);
        assertEquals(answer, 5);
    }

    @Test
    public void test2_solution1() {
        int n = 5;
        int[] lost = {2,4};
        int[] reverse = {3};

        int answer = obj.solution1(n, lost, reverse);
        assertEquals(answer, 4);
    }

    @Test
    public void test3_solution1() {
        int n = 3;
        int[] lost = {3};
        int[] reverse = {1};

        int answer = obj.solution1(n, lost, reverse);
        assertEquals(answer, 2);
    }

    @Test
    public void test4_solution1() {
        int n = 7;
        int[] lost = {3,5,7};
        int[] reverse = {2,6};

        int answer = obj.solution1(n, lost, reverse);
        assertEquals(answer, 6);
    }

    @Test
    public void test5_solution1() {
        int n = 5;
        int[] lost = {2,3};
        int[] reverse = {2,4};

        int answer = obj.solution1(n, lost, reverse);
        assertEquals(answer, 5);
    }
}