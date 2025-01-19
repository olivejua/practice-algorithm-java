package com.olivejua.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum2 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (i != 0 && nums[i] == nums[i-1]) continue;

            int num = nums[i];

            List<List<Integer>> zeroSum = findZeroSum(nums, num, i + 1, nums.length - 1);
            result.addAll(zeroSum);
        }

        return result;
    }

    private List<List<Integer>> findZeroSum(int[] nums, int fixedNumber, int left, int right) {
        List<List<Integer>> result = new ArrayList<>();

        while (left < right) {
            int currentSum = fixedNumber + nums[left] + nums[right];

            if (currentSum == 0) {
                result.add(List.of(fixedNumber, nums[left], nums[right]));
            }

            if (currentSum <= 0) {
                left++;

                while (left <= right && nums[left-1] == nums[left]) {
                    left++;
                }
            } else {
                // currentSum > 0
                right--;

                while (left <= right && nums[right+1] == nums[right]) {
                    right--;
                }
            }
        }

        return result;
    }
}
