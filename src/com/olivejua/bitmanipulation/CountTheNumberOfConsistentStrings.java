package com.olivejua.bitmanipulation;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;

        boolean[] dict = new boolean[26];
        for (char ch : allowed.toCharArray()) {
            dict[ch-'a'] = true;
        }

        for (String word : words) {
            boolean isMatch = true;

            for (char ch : word.toCharArray()) {
                if (!dict[ch-'a']) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                result++;
            }
        }

        return result;
    }
}
