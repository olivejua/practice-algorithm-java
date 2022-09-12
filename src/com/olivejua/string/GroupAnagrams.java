package com.olivejua.string;

import java.util.*;

/**
 * 그룹 애너그램
 * https://leetcode.com/problems/group-anagrams
 */
public class GroupAnagrams {

    public String[][] resolve1(String[] inputs) {
        Map<String, List<String>> dict = new HashMap<>();

        for (String input : inputs) {
            char[] letters = input.toCharArray();
            Arrays.sort(letters);

            String key = String.valueOf(letters);
            List<String> value = dict.getOrDefault(key, new ArrayList<>());
            value.add(input);

            dict.put(key, value);
        }

        return dict.values()
                .stream()
                .map(strings -> strings.toArray(new String[0]))
                .toArray(String[][]::new);
    }
}
