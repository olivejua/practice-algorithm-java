package com.olivejua.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class K번째_수Test {

    K번째_수 obj;

    @Before
    public void setUp() throws Exception {
        obj = new K번째_수();
    }

    @Test
    public void solution1() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = obj.solution(array, commands);
        assertArrayEquals(answer, new int[]{5,6,3});
    }

    @Test
    public void solution2() {
        int[] array = {2, 7, 4, 3, 1, 6, 5};
        int[][] commands = {{4, 7, 1}, {2, 4, 3}, {1, 4, 2}};

        int[] answer = obj.solution(array, commands);
        assertArrayEquals(answer, new int[]{1,7,3});
    }

    @Test
    public void solution3() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{1, 5, 2}, {4, 7, 1}, {3, 6, 3}};

        int[] answer = obj.solution(array, commands);
        assertArrayEquals(answer, new int[]{2,3,6});
    }
}