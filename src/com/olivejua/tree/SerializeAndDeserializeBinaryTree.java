package com.olivejua.tree;

import java.util.*;

/**
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree
 */
public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean hasToContinue = true;
        while (!queue.isEmpty() && hasToContinue) {
            int q_size = queue.size();
            hasToContinue = false;

            for (int i = 0; i < q_size; i++) {
                TreeNode node = queue.poll();

                if (node != null) {
                    result.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);

                    hasToContinue = node.left != null || node.right != null;
                } else {
                    result.add(null);
                    queue.add(null);
                    queue.add(null);
                }
            }
        }

        return result.toString().replaceAll(" ", "");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<Integer> parts = Arrays.stream(data
                        .replaceAll("\\[", "")
                        .replaceAll("]", "")
                        .split(","))
                        .map(value -> value == null ? null : Integer.valueOf(value))
                        .toList();




        Queue<Integer> queue = new LinkedList<>(parts);

        int repeatSize = 1;
        while(queue.size() >= repeatSize) {
            for (int i = 0; i < repeatSize; i++) {
                Integer value = queue.poll();


            }

            repeatSize = repeatSize * 2;
        }


        return null;
    }


    // Encodes a tree to a single string.
    public String serialize2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        StringBuilder sb = new StringBuilder();
        sb.append("#,").append(root.val);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
                sb.append(",").append(node.left.val);
            } else {
                sb.append(",#");
            }

            if (node.right != null) {
                queue.add(node.right);
                sb.append(",").append(node.right.val);
            } else {
                sb.append(",#");
            }
        }

        return sb.toString();
    }

    public TreeNode deserialize2(String data) {
        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[1]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int index = 2;

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (!nodes[index].equals("#")) {
                node.left = new TreeNode(Integer.parseInt(nodes[index]));
                queue.add(node.left);
            }
            index += 1;

            if (!nodes[index].equals("#")) {
                node.right = new TreeNode(Integer.parseInt(nodes[index]));
                queue.add(node.right);
            }
            index += 1;
        }

        return root;
    }
}
