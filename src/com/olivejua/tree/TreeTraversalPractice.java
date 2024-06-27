package com.olivejua.tree;

import javax.security.auth.callback.CallbackHandler;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversalPractice {
    private final List<Character> visit = new ArrayList<>();

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        visit.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void interactivePreorder(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            visit.add(node.val);

            if (node.right != null) {
                stack.add(node.right);
            }

            if (node.left != null) {
                stack.add(node.left);
            }
        }
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            inorder(root.left);
        }

        visit.add(root.val);

        if (root.right != null) {
            inorder(root.right);
        }
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            inorder(root.left);
        }

        if (root.right != null) {
            inorder(root.right);
        }

        visit.add(root.val);
    }

    public List<Character> getVisit() {
        return visit;
    }

    public static class TreeNode {
        Character val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(Character val) {
            this.val = val;
        }

        public TreeNode(Character val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
