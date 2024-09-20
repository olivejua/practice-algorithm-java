package com.olivejua.binarysearch;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int index = - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return -1;
        }

        Arrays.sort(nums);

        int indexInSortedArr = findIndexOfTarget(nums, target, 0, nums.length - 1);

        return indexInSortedArr + (index - indexInSortedArr);
    }

    int findIndexOfTarget(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                return findIndexOfTarget(nums, target, mid + 1, right);
            } else if (nums[mid] > target) {
                return findIndexOfTarget(nums, target, left, mid - 1);
            } else {
                return mid;
            }
        } else {
            return - 1;
        }
    }

    public int search2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int pivot = left;

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midPivot = (mid + pivot) % nums.length;

            if (nums[midPivot] < target) {
                left = mid + 1;
            } else if (nums[midPivot] > target) {
                right = mid - 1;
            } else {
                return midPivot;
            }
        }

        return -1;
    }
}
