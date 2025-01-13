package com.olivejua.string;

// time: O(n²), space: O(1)
public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        for (int center = 0; center < n * 2 - 1; center++) {
            int left = center / 2;
            int right = left + (center % 2);

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}
