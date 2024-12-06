package com.olivejua.twopointer;

public class StrictlyPalindromicNumber {

    public boolean isStrictlyPalindromic(int n) {
        if (n <= 4) {
            return false;
        }


        for (int base = 2; base <= n-2; base++) {
            String binary = convertBinary(n, base);

            if (!isPalindrome(binary)) {
                return false;
            }
        }

        return true;
    }

    private String convertBinary(int n, int base) {
        StringBuilder baseBinary = new StringBuilder();
        int remainder = n;
        while (remainder >= base) {
            baseBinary.append(remainder % base);
            remainder /= base;
        }

        if (remainder > 0) {
            baseBinary.append(remainder);
        }

        return baseBinary.reverse().toString();
    }

    private boolean isPalindrome(String binary) {
        int left = 0;
        int right = binary.length() - 1;

        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
