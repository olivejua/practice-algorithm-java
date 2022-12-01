package com.olivejua.greedy;

import java.util.*;

public class MakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(makePalindrome(str));
    }

    private static String makePalindrome(String value) {
        List<Character> alphabet = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        Map<Character, Integer> sizes = new HashMap<>();
        for (Character character : alphabet) {
            sizes.put(character, 0);
        }

        for (char alpha : value.toUpperCase().toCharArray()) {
            Integer size = sizes.get(alpha);
            sizes.put(alpha, size + 1);
        }

        char oddAlpha = ' ';
        StringBuilder sb = new StringBuilder();
        for (Character character : sizes.keySet()) {
            int appendSize = sizes.get(character) / 2;
            for (int i = 0; i < appendSize; i++) {
                sb.append(character);
            }

            if (sizes.get(character) % 2 != 0) {
                if (oddAlpha == ' ') {
                    oddAlpha = character;
                } else {
                    return "I'm Sorry Hansoo";
                }
            }
        }

        StringBuilder result = new StringBuilder(sb.toString());

        if (oddAlpha != ' ') {
            result.append(oddAlpha);
        }

        result.append(sb.reverse());

        return result.toString();
    }
}
