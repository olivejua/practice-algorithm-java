package com.olivejua.tree;

import java.util.*;

/**
 * https://leetcode.com/problems/find-duplicate-subtrees/description/
 */
public class FindDuplicateSubtrees {
    private Map<String, List<TreeNode>> subtrees = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                String serialized = serialize(node);

                subtrees.putIfAbsent(serialized, new ArrayList<>());
                subtrees.get(serialized).add(node);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        for (List<TreeNode> value : subtrees.values()) {
            if (value.size() >= 2) {
                result.add(value.get(0));
            }
        }

        return result;
    }


    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        List<String> chars = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            chars.add(node != null ? String.valueOf(node.val) : "#");

            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return removedEmptyValue(chars);
    }

    String removedEmptyValue(List<String> chars) {
        int idx = chars.size();
        for (int i = chars.size() - 1; i >= 0; i--) {
            if (!chars.get(i).equals("#")) {
                break;
            }

            idx = i;
        }

        List<String> elements = chars.subList(0, idx);
        return String.join(",", elements);
    }
}
