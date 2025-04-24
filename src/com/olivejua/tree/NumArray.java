package com.olivejua.tree;

public class NumArray {
    private int[] nums;
    private int[] BIT;

    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        System.arraycopy(nums, 0, this.nums, 0, nums.length);

        BIT = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            initBIT(i);
        }
    }

    private void initBIT(int index) {
        int val = nums[index];
        index += 1;

        while (index <= nums.length) {
            BIT[index] += val;
            index += index & (-index);
        }
    }

    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] += diff;

        index += 1;

        while (index <= nums.length) {
            BIT[index] += diff;
            index += index & (-index);
        }
    }

    public int sumRange(int left, int right) {
        left += 1;
        right += 1;

        return sum(right) - sum(left-1);
    }

    private int sum(int index) {
        int sum = 0;
        while (index > 0) {
            sum += BIT[index];

            index -= index & (-index);
        }

        return sum;
    }
}
