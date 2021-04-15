package com.olivejua.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisguiseTest {

    @Test
    public void solutionTest1() {

        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Disguise disguise = new Disguise();
        int result = disguise.solution(clothes);

        assertEquals(5, result);

    }

    @Test
    public void solutionTest2() {

        String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

        Disguise disguise = new Disguise();
        int result = disguise.solution(clothes);

        assertEquals(3, result);
    }
}