package com.olivejua.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 유효한 팰린드롬
 * https://leetcode.com/problems/valid-palindrome
 */

public class ValidPalindrome {

    public boolean solve1(String input) {
        StringBuilder letters = new StringBuilder();

        for (char letter : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(letter)) {
                letters.append(letter);
            }
        }

        String originalLetters = letters.toString();
        String reversedLetters = letters.reverse().toString();
        return originalLetters.equals(reversedLetters);
    }

    public boolean solve2(String input) {
        Stack<Character> stack = new Stack<>();
        List<Character> originalLetters = new ArrayList<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(c);
                originalLetters.add(c);
            }
        }

        for (Character originalLetter : originalLetters) {
            if (!originalLetter.equals(stack.pop())) return false;
        }

        return true;
    }

    public boolean solve3(String input) {
        List<Character> letters = new ArrayList<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                letters.add(c);
            }
        }

        int reversedIdx = letters.size()-1;
        for (int i = 0; i < letters.size(); i++) {
            if (!letters.get(i).equals(letters.get(reversedIdx--))) return false;
        }

        return true;
    }
}


