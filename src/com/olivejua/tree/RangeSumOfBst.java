package com.olivejua.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/range-sum-of-bst
 */
public class RangeSumOfBst {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root != null) {
            if (low < root.val) {
                rangeSumBST(root.left, low, high);
            }

            if (low <= root.val && root.val <= high) {
                sum += root.val;
            }

            if (root.val < high) {
                rangeSumBST(root.right, low, high);
            }
        }

        return sum;
    }

    public int rangeSumBST2(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int result = 0;

        if (low <= root.val && root.val <= high) {
            result += root.val;
            result += rangeSumBST2(root.left, low, high);
            result += rangeSumBST2(root.right, low, high);
        }

        return result;
    }

    public int rangeSumBST3(TreeNode root, int low, int high) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        int result = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.val > low) {
                if (node.left != null) stack.push(node.left);

            }
            if (node.val < high) {
                if (node.right != null) stack.push(node.right);
            }
            if (low <= node.val && node.val <= high) {
                result += node.val;
            }
        }

        return result;
    }
}
