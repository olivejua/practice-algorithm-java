package com.olivejua.dp;

public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {
        int start = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[start]) {
                start = i;
            }
        }

        start = (start+1) % nums.length;
        int maxSum = nums[start];
        int maxIndex = start;
        int currentSum = nums[start];

        int index = (start+1) % nums.length;
        while (index != start && index != maxIndex) {
            if ((currentSum+nums[index]) < nums[index]) {
                currentSum = nums[index];
                start = index;
            } else {
                currentSum += nums[index];
            }

            if (maxSum < currentSum) {
                maxSum = currentSum;
                maxIndex = index;
            }

            index = (index+1) % nums.length;
        }

        return maxSum;
    }
}
