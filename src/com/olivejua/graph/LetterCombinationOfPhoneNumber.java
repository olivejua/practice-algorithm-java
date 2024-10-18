package com.olivejua.graph;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
    char[][] dial = {
            {},
            {},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r', 's'},
            {'t','u','v'},
            {'w','x','y', 'z'},
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        dfs(result, digits, 0, "");

        return result;
    }

    public void dfs(List<String> result, String digits, int index, String str) {
        if (index >= digits.length()) {
            if (!str.isBlank()) {
                result.add(str);
            }
            return;
        }

        int dialIndex = digits.charAt(index) - 48;
        for (char character : dial[dialIndex]) {
            dfs(result, digits, index+1, str + character);
        }
    }
}
