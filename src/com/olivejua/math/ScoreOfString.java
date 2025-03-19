package com.olivejua.math;

public class ScoreOfString {
    public int scoreOfString(String s) {
        int result = 0;
        int previous = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            result += Math.abs(previous - s.charAt(i));
            previous = s.charAt(i);
        }

        return result;
    }
}
