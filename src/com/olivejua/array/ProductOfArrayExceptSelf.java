package com.olivejua.array;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        // () 2 3 4
        // 1 () 3 4
        // 1 2 () 4
        // 1 2 3 ()

        // left
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left *= nums[i];
        }
        // 1 1 2 6

        // right
        int right = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }
}
