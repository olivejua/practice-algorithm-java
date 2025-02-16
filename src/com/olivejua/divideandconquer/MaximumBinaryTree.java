package com.olivejua.divideandconquer;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length-1);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        if (end-start == 0) {
            return new TreeNode(nums[start]);
        }

        int value = nums[start];
        int index = start;

        for (int i = start+1; i <= end; i++) {
            if (value < nums[i]) {
                value = nums[i];
                index = i;
            }
        }

        return new TreeNode(value,
                constructMaximumBinaryTree(nums, start, index-1),
                constructMaximumBinaryTree(nums, index+1, end));
    }
}
