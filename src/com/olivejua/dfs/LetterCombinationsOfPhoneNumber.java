package com.olivejua.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    List<List<Character>> pad = List.of(
            Collections.emptyList()
            , Collections.emptyList()
            , List.of('a', 'b', 'c')
            , List.of('d', 'e', 'f')
            , List.of('g', 'h', 'i')
            , List.of('j', 'k', 'l')
            , List.of('m', 'n', 'o')
            , List.of('p', 'q', 'r', 's')
            , List.of('t', 'u', 'v')
            , List.of('w', 'x', 'y', 'z')
    );

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isBlank()) {
            return Collections.emptyList();
        }

        char[] characters = digits.toCharArray();
        int[] digitArr = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            digitArr[i] = Character.getNumericValue(characters[i]);
        }
        dfs(digitArr, 0, new StringBuilder());

        return result;
    }


    void dfs(int[] digits, int index, StringBuilder combination) {
        if (digits.length <= index) {
            result.add(combination.toString());
            return;
        }

        List<Character> characters = pad.get(digits[index]);
        for (Character character : characters) {
            dfs(digits, index+1, new StringBuilder(combination).append(character));
        }
    }
}
