package com.olivejua.greedy;

public class CanJump {

    public boolean canJump(int[] nums) {
        int currentIndex = 0;

        while (currentIndex != -1 && currentIndex < nums.length-1) {
            if (nums[currentIndex] == 0) {
                return currentIndex == nums.length-1;
            }

            currentIndex = nextIndexOfMaxNumber(nums, currentIndex);
        }

        return currentIndex != -1;
    }

    private int nextIndexOfMaxNumber(int[] nums, int index) {
        int maximumJumpIndex = index + nums[index];
        if (maximumJumpIndex >= nums.length-1) {
            return maximumJumpIndex;
        }

        int nextIndex = index + 1;
        int nextMaximumJumpIndex = nextIndex + nums[nextIndex];
        for (int i = nextIndex; i <= maximumJumpIndex; i++) {
            int thisMaximumJumpIndex = i + nums[i];

            if (thisMaximumJumpIndex >= nums.length-1) {
                return i;
            }

            if (nextMaximumJumpIndex <= thisMaximumJumpIndex) {
                nextIndex = i;
                nextMaximumJumpIndex = thisMaximumJumpIndex;
            }
        }

        return nextIndex;
    }
}
