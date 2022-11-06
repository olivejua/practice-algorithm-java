package com.olivejua.array;

/**
 * 빗물 트래핑
 * https://leetcode.com/problems/trapping-rain-water
 */
public class TrappingRainWater {

    /**
     * 투포인터
     */
    public int solve1(int[] nums) {
        int result = 0;
        int left = 0;
        int right = 0;

        while (++right <= nums.length) {
            if (nums[left] > nums[right]) {
                result += nums[left] - nums[right];
            } else {
                left = right;
            }
        }

        return result;
    }
}
