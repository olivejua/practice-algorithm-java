package com.olivejua.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GroupAnagramsTest {
    private final GroupAnagrams PROBLEM = new GroupAnagrams();

    private final String[] INPUT = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
    private final String[][] OUTPUT = new String[][] {
            {"ate", "eat", "tea"},
            {"nat", "tan"},
            {"bat"}
    };

    @Test
    public void testSolve1() {
        String[][] actualResult = PROBLEM.solve1(INPUT);
        assertEquals(OUTPUT.length, actualResult.length);
    }
}