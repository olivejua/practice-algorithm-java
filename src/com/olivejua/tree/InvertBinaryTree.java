package com.olivejua.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/invert-binary-tree
 */
public class InvertBinaryTree {
    TreeNode result;

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            result = new TreeNode(root.val);
        }

        dfs(root, result);

        return result;
    }

    private void dfs(TreeNode source, TreeNode changed) {
        if (source == null) {
            return;
        }

        changed.left = source.right != null ? new TreeNode(source.right.val) : null;
        changed.right = source.left != null ? new TreeNode(source.left.val) : null;

        dfs(source.left, changed.right);
        dfs(source.right, changed.left);
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode newNode = new TreeNode(root.val);
        newNode.left = invertTree2(root.right);
        newNode.right = invertTree2(root.left);

        return newNode;
    }

    public TreeNode invertTree3(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree3(root.left);
            invertTree3(root.right);
        }

        return root;
    }

    public TreeNode invertTree4(TreeNode root) {
        if (root == null) {
            return null;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                stack.push(node.left);
            }

            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return root;
    }

    public TreeNode invertTree5(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return root;
    }
}
