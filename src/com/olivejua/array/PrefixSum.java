package com.olivejua.array;

public class PrefixSum {

    public int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        return prefixSum;
    }

    public int rangeSum(int[] prefixSum, int L, int R) {
        return prefixSum[R + 1] - prefixSum[L];
    }
}
