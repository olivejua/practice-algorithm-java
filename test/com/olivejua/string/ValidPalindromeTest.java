package com.olivejua.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {
    private final ValidPalindrome target = new ValidPalindrome();


    private final String INPUT1 = "A man, a plan, a canal: Panama";
    private final String INPUT2 = "race a car";

    @Test
    public void testResolve1() {
        assertTrue(target.resolve1(INPUT1));
        assertFalse(target.resolve1(INPUT2));
    }

    @Test
    public void testResolve2() {
        assertTrue(target.resolve2(INPUT1));
        assertFalse(target.resolve2(INPUT2));
    }

    @Test
    public void testResolve3() {
        assertTrue(target.resolve3(INPUT1));
        assertFalse(target.resolve3(INPUT2));
    }
}
