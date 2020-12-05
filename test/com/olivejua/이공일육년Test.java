package com.olivejua;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class 이공일육년Test {

    이공일육년 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 이공일육년();
    }

    @Test
    public void solutionTest1() {

        String answer = obj.solution(5, 24);
        assertEquals(answer, "TUE");
    }

    @Test
    public void solutionTest2() {

        String answer = obj.solution(1, 1);
        assertEquals(answer, "FRI");
    }

    @Test
    public void solutionTest3() {

        String answer = obj.solution(3, 1);
        assertEquals(answer, "TUE");
    }
}
