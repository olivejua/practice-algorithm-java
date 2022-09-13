package com.olivejua.array;

/**
 * 두수의 합
 * https://leetcode.com/problems/two-sum
 */
public class TwoSum {

    /**
     * 브루트포스
     */
    public int[] solve1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return result(i, j);
                }
            }
        }

        return null;
    }

    /**
     * 투포인터
     */
    public int[] solve2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                return result(left, right);
            }
        }

        return null;
    }

    private int[] result(int idx1, int idx2) {
        return new int[] {idx1, idx2};
    }
}
