package com.olivejua.string;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        String result = "";

        char[] chars = s.toCharArray();
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            int contains = contains(chars, start, i, character);
            if (contains != -1) {
                start = contains + 1;
            }

            if (result.length() < ((i + 1) - start)) {
                result = s.substring(start, i + 1);
            }
        }

        return result.length();
    }

    int contains(char[] characters, int start, int end, char findCharacter) {
        for (int i = start; i < end; i++) {
            if (characters[i] == findCharacter) {
                return i;
            }
        }

        return -1;
    }

}
