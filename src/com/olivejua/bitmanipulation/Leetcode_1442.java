package com.olivejua.bitmanipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * 1442. Count Triplets That Can Form Two Arrays of Equal XOR
 */
public class Leetcode_1442 {

    public int countTriplets2(int[] arr) {
        int result = 0;

        for (int i = 0; i <= arr.length - 2; i++) {
            int a = 0;

            for (int j = i+1; j <= arr.length - 1; j++) {
                a ^= arr[j-1];
                int b = 0;

                for (int k = j; k <= arr.length - 1; k++) {
                    b ^= arr[k];

                    if (a == b) {
                        result++;
                    }
                }
            }
        }


        return result;
    }

    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefixXor = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixXor[i+1] = prefixXor[i] ^ arr[i];
        }


    }
}
