package com.olivejua.bitmanipulation;

public class MaximumXORForEachQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] result = new int[n];

        int cur = (int) Math.pow(2, maximumBit) - 1;

        for (int i = 0; i < n; i++) {
            cur ^= nums[i];

            result[n-1-i] = cur;
        }

        return result;
    }
}
