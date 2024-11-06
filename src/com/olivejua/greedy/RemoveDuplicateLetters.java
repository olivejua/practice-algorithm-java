package com.olivejua.greedy;

import java.util.Stack;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        boolean[] seen = new boolean[26];
        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (seen[letter-'a']) continue;;

            while (!stack.isEmpty() && stack.peek() > letter && lastIndex[stack.peek()-'a'] > i) {
                Character pop = stack.pop();
                seen[pop-'a'] = false;
            }

            stack.push(letter);
            seen[letter-'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        for (Character character : stack) {
            result.append(character);
        }

        return result.toString();
    }
}
