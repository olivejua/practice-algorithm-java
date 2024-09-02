package com.olivejua.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int length = Integer.MAX_VALUE;
        for (String str : strs) {
            length = Math.min(length, str.length());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char target = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (target != strs[j].charAt(i)) {
                    return result.toString();
                }
            }

            result.append(target);
        }

        return result.toString();
    }
}
