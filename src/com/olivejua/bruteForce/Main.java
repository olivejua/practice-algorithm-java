package com.olivejua.bruteForce;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < size; i++) {
            String input = sc.next();

            boolean equals = false;

            for (String word : words) {
                if (compare(word, input)) {
                    equals = true;
                    break;
                }
            }

            if (!equals) {
                words.add(input);
            }
        }

        System.out.println(words.size());
    }

    private static boolean compare(String word, String input) {
        if (word.length() != input.length()) {
            return false;
        }

        if (word.equals(input)) {
            return true;
        }

        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < word.length(); i++) {
            boolean same = true;
            for (int j = 0; j < input.length(); j++) {
                if (word.charAt(j) == sb.toString().charAt(j)) {
                    same = true;
                } else {
                    sb.append(sb.charAt(0)).deleteCharAt(0);
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }
}
