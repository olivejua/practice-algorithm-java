package com.olivejua.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacter problem = new LongestSubstringWithoutRepeatingCharacter();

        String s = "abcabcbbc";
//        String s = " ";
//        String s = "au";
        int result = problem.lengthOfLongestSubstring(s);
        System.out.println("result = " + result);
    }

    public int lengthOfLongestSubstring(String s) {
        char[] characters = s.toCharArray();

        int longestLength = 0;
        Map<Character, Integer> used = new HashMap<>();
        int left = 0;

        for (int right = 0; right < characters.length; right++) {
            char rightChar = characters[right];

            if (used.containsKey(rightChar) && left <= used.get(rightChar)) {
                left = used.get(rightChar);
            } else {
                longestLength = Math.max(longestLength, right - left + 1);
            }

            used.put(rightChar, right);
            print(used);
        }

        return longestLength;
    }

    static void print(Map<Character, Integer> value) {
        System.out.print("[");
        for (Map.Entry<Character, Integer> entry : value.entrySet()) {
            System.out.print(entry.getKey() + " / ");
        }

        System.out.print("]\n");
    }
}
