package com.olivejua.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];

        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            count[letters[i]-'a']++;
        }

        boolean[] seen = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();
        for (char letter : letters) {
            if (seen[letter-'a']) {
                count[letter-'a']--;
                continue;
            }

            while (!stack.isEmpty() && stack.peek() >= letter && count[stack.peek()-'a'] >= 1) {
                seen[stack.pop()-'a'] = false;
            }

            stack.push(letter);
            count[letter-'a']--;
            seen[letter-'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        for (Character letter : stack) {
            result.append(letter);
        }

        return result.reverse().toString();
    }
}
