package com.olivejua.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    // 시간복잡도, 공간복잡도 O(n)
    public int deepestLeavesSum(TreeNode root) {
        int result = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int sum = 0;

            Queue<TreeNode> next = new LinkedList<>();
            int q_size = q.size();
            for (int i = 0; i < q_size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) {
                    next.add(node.left);
                }

                if (node.right != null) {
                    next.add(node.right);
                }
            }

            if (!next.isEmpty()) {
                q = next;
            } else {
                result = sum;
            }
        }

        return result;
    }

    int sum = 0;
    int maxLevel = 0;
    public int deepestLeavesSum2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        calculateSumAtLevel(root, 0);

        return sum;
    }

    private void calculateSumAtLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (level > maxLevel) {
            sum = 0;
            maxLevel = level;
        }
        if (level == maxLevel) {
            sum += root.val;
        }

        calculateSumAtLevel(root.left, level+1);
        calculateSumAtLevel(root.right, level+1);
    }
}
