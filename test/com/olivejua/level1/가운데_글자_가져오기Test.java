package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class 가운데_글자_가져오기Test {

    가운데_글자_가져오기 obj;

    @Before
    public void setUp() throws Exception {
        obj = new 가운데_글자_가져오기();
    }

    @Test
    public void solutionTest1() {
        String answer = obj.solution("abcdef");
        assertEquals(answer, "cd");
    }

    @Test
    public void solutionTest2() {
        String answer = obj.solution("abcde");
        assertEquals(answer, "c");
    }

    @Test
    public void solutionTest3() {
        String answer = obj.solution("안녕하세요");
        assertEquals(answer, "하");
    }

    @Test
    public void solutionTest4() {
        String answer = obj.solution("오늘은토요일이다");
        assertEquals(answer, "토요");
    }
}