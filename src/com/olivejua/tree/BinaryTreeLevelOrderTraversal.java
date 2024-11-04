package com.olivejua.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();

            int q_size = q.size();
            for (int i = 0; i < q_size; i++) {
                TreeNode node = q.poll();
                if (node != null) {
                    level.add(node.val);

                    q.add(node.left);
                    q.add(node.right);
                }
            }

            if (!level.isEmpty()) {
                result.add(level);
            }
        }

        return result;
    }
}
