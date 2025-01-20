package com.olivejua.sort;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (count[t.charAt(i)-'a'] > 0) {
                count[t.charAt(i)-'a']--;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int end = s.length()-1;

        char[] sortedS = divideAndConquer(s.toCharArray(), 0, end);
        char[] sortedT = divideAndConquer(t.toCharArray(), 0, end);

        int idx = 0;
        while (idx <= end) {
            if (sortedS[idx] != sortedT[idx]) {
                return false;
            }

            idx++;
        }

        return true;
    }

    private char[] divideAndConquer(char[] source, int start, int end) {
        if (start == end) {
            return source;
        }

        int halfIdx = start + (end - start) / 2;

        source = divideAndConquer(source, start, halfIdx);
        source = divideAndConquer(source, halfIdx+1, end);

        int idx1 = start;
        int idx2 = halfIdx+1;
        while (idx1 <= halfIdx && idx2 <= end) {
            if (source[idx1] <= source[idx2]) {
                idx1++;
            } else {
                char temp = source[idx2];
                System.arraycopy(source, idx1, source, idx1+1, idx2-idx1);
                source[idx1] = temp;

                idx1++;
                halfIdx++;
                idx2++;
            }
        }

        return source;
    }
}
