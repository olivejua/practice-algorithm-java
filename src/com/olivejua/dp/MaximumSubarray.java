package com.olivejua.dp;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                result = Math.max(result, sum);
            }
        }
         return result;
    }

    public int maxSubArray2(int[] nums) {
        int[] sums = new int[nums.length];

        int result = nums[0];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + (Math.max(sums[i - 1], 0));
            result = Math.max(result, sums[i]);
        }

        return result;
    }

    public int maxSubArray3(int[] nums) {
        int bestSum = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            bestSum = Math.max(currentSum, bestSum);
        }

        return bestSum;
    }
}
