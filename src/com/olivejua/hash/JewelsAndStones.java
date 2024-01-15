package com.olivejua.hash;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public static void main(String[] args) {
        JewelsAndStones problem = new JewelsAndStones();
        int answer = problem.numJewelsInStones("aA", "aAAbbbb");
        System.out.println("answer = " + answer);
    }

    Map<Character, Integer> freq = new HashMap<>();

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        for (char stone : stones.toCharArray()) {
            if (freq.containsKey(stone)) {
                freq.put(stone, freq.get(stone) + 1);
            } else {
                freq.put(stone, 1);
            }
        }

        for (char jewel : jewels.toCharArray()) {
            result += freq.getOrDefault(jewel, 0);
        }

        return result;
    }
}
