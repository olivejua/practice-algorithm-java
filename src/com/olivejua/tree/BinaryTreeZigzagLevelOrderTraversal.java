package com.olivejua.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean turn = true;

        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();

            int q_size = q.size();
            LinkedList<TreeNode> newQ = new LinkedList<>();
            for (int i = 0; i < q_size; i++) {
                TreeNode node = q.poll();
                if (node != null) {
                    level.add(node.val);

                    if (turn) {
                        newQ.add(0, node.left);
                        newQ.add(0, node.right);
                    } else {
                        newQ.add(0, node.right);
                        newQ.add(0, node.left);
                    }
                }
            }

            if (!level.isEmpty()) {
                result.add(level);
            }

            q = newQ;
            turn = !turn;
        }

        return result;
    }
}
