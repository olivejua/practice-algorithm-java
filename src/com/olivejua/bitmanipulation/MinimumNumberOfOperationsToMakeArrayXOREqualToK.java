package com.olivejua.bitmanipulation;

public class MinimumNumberOfOperationsToMakeArrayXOREqualToK {

    public int minOperations(int[] nums, int k) {
        int currentXor = 0;
        for (int num : nums) {
            currentXor ^= num;
        }

        if (currentXor == k) {
            return 0;
        }

        currentXor ^= k;
        int count = 0;
        while (currentXor > 0) {
            count += (currentXor & 1);
            currentXor >>= 1;
        }

        return count;
    }
}
