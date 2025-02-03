package com.olivejua.tree;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int idx = nums.length/2;
        while (0 <= idx && idx < nums.length) {
            int num = nums[idx];
            if ((idx == 0 || nums[idx-1] < num) && (idx == nums.length-1 || nums[idx+1] < num)) {
                return idx;
            }

            if (idx < nums.length-1 && num < nums[idx+1]) {
                idx++;
            } else if (idx > 0 && num < nums[idx-1]) {
                idx--;
            }
        }

        return -1;
    }

    public int findPeakElement2(int[] nums) {
        int left = 0, right = nums.length-1;

        while (left < right) {
            int mid = left + (right-left) / 2;

            if (nums[mid] < nums[mid+1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
