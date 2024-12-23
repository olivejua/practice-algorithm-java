package com.olivejua.greedy;

public class StringPasswordChecker {
    int maximumLength = 20;
    int minimumLength = 6;

    public int strongPasswordChecker(String password) {
        if (password.length() < minimumLength) {
            return minimumLength - password.length();
        }

        int replaceCount = 0;

        boolean lowercase = false;
        boolean uppercase = false;
        boolean digits = false;

        char[] letters = password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];

            //소문자면 lowercase
            //대문자면 uppercase
            //숫자면 digits
            //연달아 있으면 3개이상이면 count 추가하기

            if ('a' <= letter && letter <= 'z') {
                lowercase = true;
            } else if ('A' <= letter && letter <= 'Z') {
                uppercase = true;
            } else {
                digits = true;
            }

            if (i >= 2 && password.charAt(i) == password.charAt(i-1)
                    && password.charAt(i) == password.charAt(i-2)) {
                replaceCount++;
                i+=2;
            }
        }

        int missingTypes = 0;
        if (!lowercase) missingTypes++;
        if (!uppercase) missingTypes++;
        if (!digits) missingTypes++;

        if (password.length() > maximumLength) {
            return password.length() - maximumLength + missingTypes;
        }

        return Math.max(replaceCount, missingTypes);
    }

}
