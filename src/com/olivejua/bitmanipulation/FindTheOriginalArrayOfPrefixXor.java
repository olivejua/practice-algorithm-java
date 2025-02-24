package com.olivejua.bitmanipulation;

public class FindTheOriginalArrayOfPrefixXor {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            result[i] = pref[i - 1] ^ pref[i];
        }

        return result;
    }

    public int[] findArray2(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] ^= arr[i-1];
        }

        return arr;
    }

}
