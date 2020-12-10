package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 같은_숫자는_싫어Test {

    같은_숫자는_싫어 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 같은_숫자는_싫어();
    }

    @Test
    public void solutionTest1() {
        int[] example = {1,1,3,3,0,1,1};
        int[] answer = obj.solution(example);

        int[] expectedAnswer = {1,3,0,1};

        assertArrayEquals(answer, expectedAnswer);
    }

    @Test
    public void solutionTest2() {
        int[] example = {4,4,4,3,3};
        int[] answer = obj.solution(example);

        int[] expectedAnswer = {4,3};

        assertArrayEquals(answer, expectedAnswer);
    }

    @Test
    public void solutionTest3() {
        int[] example = {1,1,3,3,0,1};
        int[] answer = obj.solution(example);

        int[] expectedAnswer = {1,3,0,1};

        assertArrayEquals(answer, expectedAnswer);
    }
}