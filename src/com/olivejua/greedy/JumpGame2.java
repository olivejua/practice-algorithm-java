package com.olivejua.greedy;

public class JumpGame2 {

    public int jump(int[] nums) {
        int result = 0;

        int i = 0;
        while (i < nums.length-1) {
            if (i + nums[i] >= nums.length-1) {
                i = nums.length-1;
            } else {
                i = maxIndex(nums, i+1, i+nums[i]);
            }

            result++;
        }

        return i >= nums.length-1 ? result : -1;
    }

    private int maxIndex(int[] nums, int start, int end) {
        int result = start;

        for (int i = start; i <= Math.min(end, nums.length-1); i++) {
            if (result + nums[result] <= i + nums[i]) {
                result = i;
            }
        }

        return result;
    }
}
