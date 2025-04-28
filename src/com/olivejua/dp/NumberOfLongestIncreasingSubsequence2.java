package com.olivejua.dp;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence2 {

    public int findNumberOfLIS(int[] nums) {
        int[] length = new int[nums.length];
        int[] count = new int[nums.length];

        Arrays.fill(length, 1);
        Arrays.fill(count, 1);

        int maxLen = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    } else if (length[j] + 1 == length[i]) {
                        count[i] += count[j];
                    }
                }
            }
            maxLen = Math.max(maxLen, length[i]);
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (length[i] == maxLen) {
                result += count[i];
            }
        }

        return result;
    }
}
