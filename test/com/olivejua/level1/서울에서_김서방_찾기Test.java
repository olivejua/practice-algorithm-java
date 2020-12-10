package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 서울에서_김서방_찾기Test {

    서울에서_김서방_찾기 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 서울에서_김서방_찾기();
    }

    @Test
    public void solutionTest1() {
        String[] seoul = {"Jane", "Kim"};

        String expectedAnswer = "김서방은 1에 있다";
        String actualAnswer = obj.solution(seoul);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void solutionTest2() {
        String[] seoul = {"Andrew", "Jane", "Kim", "Lee", "Park"};

        String expectedAnswer = "김서방은 2에 있다";
        String actualAnswer = obj.solution(seoul);

        assertEquals(expectedAnswer, actualAnswer);
    }
}