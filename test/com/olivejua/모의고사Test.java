package com.olivejua;

import org.junit.Test;

import static org.junit.Assert.*;

public class 모의고사Test {

//    @Test
//    public void main() {
//    }

    @Test
    public void solution1() {
        모의고사 obj = new 모의고사();

        int[] answers = {1,2,3,4,5};

        assertArrayEquals(obj.solution(answers), new int[]{1});
    }

    @Test
    public void solution2() {
        모의고사 obj = new 모의고사();

        int[] answers = {1,3,2,4,2};

        assertArrayEquals(obj.solution(answers), new int[]{1,2,3});
    }

    @Test
    public void solution3() {
        모의고사 obj = new 모의고사();

        int[] answers = {1,3,2,4,2};

        assertArrayEquals(obj.solution(answers), new int[]{1,2,3});
    }
}