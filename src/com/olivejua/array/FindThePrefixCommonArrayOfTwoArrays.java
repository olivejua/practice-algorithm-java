package com.olivejua.array;

public class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] seen = new boolean[51];
        int[] result = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (seen[A[i]]) {
                count++;
            } else {
                seen[A[i]] = true;
            }

            if (seen[B[i]]) {
                count++;
            } else {
                seen[B[i]] = true;
            }

            result[i] = count;
        }

        return result;
    }
}
