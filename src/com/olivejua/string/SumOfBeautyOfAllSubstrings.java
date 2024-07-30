package com.olivejua.string;

/**
 * https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
 */
public class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int result = 0;

        for (int start = 0; start <= s.length()-3; start++) {
            for (int end = start+3; end <= s.length(); end++) {
                String substring = s.substring(start, end);
                result += getBeauty(substring);
            }
        }

        return result;
    }

    private int getBeauty(String substring) {
        int max = 0;
        int min = substring.length();

        int[] frequency = new int[26];

        for (char letter : substring.toCharArray()) {
            frequency[letter - 'a'] += 1;
        }

        for (int each : frequency) {
            if (each > 0) {
                max = Math.max(max, each);
                min = Math.min(min, each);
            }
        }

        return max - min;
    }
}
