package com.olivejua.binarysearch;

public class LCBinarySearch {

    public int search(int[] nums, int target) {
        return dfs(nums, 0, nums.length, target);
    }


    int dfs(int[] nums, int start, int end, int target) {
        if (end <= start || start >= nums.length || end <= 0) {
            return -1;
        }

        if ((end-start) == 1) {
            return nums[start] == target ? start : -1;
        }

        int mid = (end + start) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            return dfs(nums, start, mid, target);
        }

        return dfs(nums, mid, end, target);
    }
}
