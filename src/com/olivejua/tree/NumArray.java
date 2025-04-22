package com.olivejua.tree;

public class NumArray {
    private int[] nums;
    private int[] BIT;

    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        System.arraycopy(nums, 0, this.nums, 0, nums.length);

        BIT = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            update(i, nums[i]);
        }
    }

    public void update(int index, int val) {
        val = val - nums[index];
        nums[index] -= val;

        index += 1;

        while (index <= nums.length) {
            BIT[index] += val;
            index += index & (-index);
        }
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        left += 1;
        right += 1;

        int index = right;
        while (index >= left) {
            sum += BIT[index];

            index -= index & (-index);
        }

        return sum;
    }
}
