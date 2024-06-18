package com.olivejua.tree;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int idx = nums.length / 2;

        TreeNode node = new TreeNode(nums[idx]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, idx));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, idx+1, nums.length));

        return node;
    }
}
