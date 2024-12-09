package com.olivejua.backtracking;

public class CountNumberOfMaximumBitwiseORSubsets {

    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        int count = 0;

        for (int num : nums) {
            maxOR |= num;
        }

        count = backtrack(nums, 0, 0, maxOR);

        return count;
    }

    private int backtrack(int[] nums, int index, int currentOR, int maxOR) {
        if (index == nums.length) {
            return currentOR == maxOR ? 1 : 0;
        }

        int exclude = backtrack(nums, index + 1, currentOR, maxOR);
        int include = backtrack(nums, index + 1, currentOR | nums[index], maxOR);

        return exclude + include;
    }
}
