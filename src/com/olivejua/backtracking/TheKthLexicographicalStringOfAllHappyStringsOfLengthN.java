package com.olivejua.backtracking;

import java.util.ArrayList;
import java.util.List;

public class TheKthLexicographicalStringOfAllHappyStringsOfLengthN {
    private final char[] happyLetters = new char[] {'a', 'b', 'c'};

    public String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();

        backtracking(new StringBuilder(), n, k, result);

        if (result.size() < k) {
            return "";
        }

        return result.get(k-1);
    }

    private boolean backtracking(StringBuilder cur, int n, int k, List<String> result) {
        if (cur.length() == n) {
            result.add(cur.toString());

            if (result.size() >= k) {
                return true;
            }

            return false;
        }

        for (char happyLetter : happyLetters) {
            if (!cur.isEmpty() && cur.charAt(cur.length() - 1) == happyLetter) {
                continue;
            }

            cur.append(happyLetter);
            if (backtracking(cur, n, k, result)) {
                return true;
            }
            cur.deleteCharAt(cur.length()-1);
        }

        return false;
    }
}
