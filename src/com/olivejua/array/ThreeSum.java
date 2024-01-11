package com.olivejua.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 세 수의 합 https://leetcode.com/problenms/3sum
 */
public class ThreeSum {

    /**
     * 출력 :
     * [
     *  [-1, 0, 1],
     *  [-1, -1, 2]
     * ]
     */
    public static void main(String[] args) {
//        int[] nums = new int[] {-1, 0, 1, 2, -1, -5};
//        int[] nums = new int[] {0,0,0,0};
        int[] nums = new int[] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};

        List<List<Integer>> result = threeSum_twoPointer(nums);
        result.forEach(each -> System.out.println(Arrays.toString(each.toArray())));
    }


    /**
     * O(n3)
     */
    static List<List<Integer>> threeSum_bruteforce(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> results = new LinkedList<>();

        // 0 ~ 3
        for (int i = 0; i < nums.length-2; i++) {
            if (0 < i && nums[i] == nums[i-1]) {
                continue;
            }

            // 1 ~ 4
            for (int j = i+1 ; j < nums.length-1; j++) {
                if (i+1 < j && nums[j] == nums[j-1]) {
                    continue;
                }

                // 2 ~ 5
                for (int k = j+1; k < nums.length; k++) {
                    if (j+1 < k && nums[k] == nums[k-1]) {
                        continue;
                    }

                    if (nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> result = List.of(nums[i], nums[j], nums[k]);
                        results.add(result);
                    }
                }

            }
        }


        return results;
    }

    /**
     * O(n2)
     */
    static List<List<Integer>> threeSum_twoPointer(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> results = new LinkedList<>();

        // 0 ~ 3
        for (int i = 0; i < nums.length - 2; i++) {
            // 1
            int left = i + 1;
            // 5
            int right = nums.length - 1;

            if (0 < i && nums[i-1] == nums[i]) {
                continue;
            }

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    results.add(List.of(nums[i], nums[left], nums[right]));
                }

                if (sum <= 0) {
                    left++;

                    while(left < right && nums[left-1] == nums[left]) {
                        left++;
                    }
                } else {
                    right--;

                    while (left < right && nums[right+1] == nums[right]) {
                        right--;
                    }
                }
            }
        }

        return results;
    }

    static List<List<Integer>> threeSum_twoPointer_A(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> results = new LinkedList<>();

        // 0 ~ 3
        for (int i = 0; i < nums.length - 2; i++) {
            // 1
            int left = i + 1;
            // 5
            int right = nums.length - 1;

            if (0 < i && nums[i-1] == nums[i]) {
                continue;
            }

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    left++;
                } else if (sum < 0){
                    right--;
                } else {
                    results.add(List.of(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left+1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return results;
    }
}
