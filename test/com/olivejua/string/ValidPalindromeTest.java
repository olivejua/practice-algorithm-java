package com.olivejua.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {
    private final ValidPalindrome PROBLEM = new ValidPalindrome();


    private final String INPUT1 = "A man, a plan, a canal: Panama";
    private final String INPUT2 = "race a car";

    @Test
    public void testSolve1() {
        assertTrue(PROBLEM.solve1(INPUT1));
        assertFalse(PROBLEM.solve1(INPUT2));
    }

    @Test
    public void testSolve2() {
        assertTrue(PROBLEM.solve2(INPUT1));
        assertFalse(PROBLEM.solve2(INPUT2));
    }

    @Test
    public void testSolve3() {
        assertTrue(PROBLEM.solve3(INPUT1));
        assertFalse(PROBLEM.solve3(INPUT2));
    }
}
