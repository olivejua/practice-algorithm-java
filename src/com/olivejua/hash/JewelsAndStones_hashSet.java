package com.olivejua.hash;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones_hashSet {

    public static void main(String[] args) {
        JewelsAndStones_hashSet problem = new JewelsAndStones_hashSet();
        int answer = problem.numJewelsInStones("aA", "aAAbbbb");
        System.out.println("answer = " + answer);
    }

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        Set<Character> freq = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            freq.add(jewel);
        }

        for (char stone : stones.toCharArray()) {
            if (freq.contains(stone)) {
                result++;
            }
        }

        return result;
    }
}
