package com.olivejua.array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean plusOne = true;

        int index = digits.length-1;
        while (plusOne && index >= 0) {
            if ((digits[index]+1) % 10 == 0) {
                digits[index] = 0;
            } else {
                digits[index] += 1;
                plusOne = false;
            }

            index--;
        }

        if (!plusOne) {
            return digits;
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i-1];
        }

        return result;
    }
}
