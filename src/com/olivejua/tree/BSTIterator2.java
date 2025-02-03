package com.olivejua.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BSTIterator2 {
    private final Deque<TreeNode> stack = new ArrayDeque<>();

    public BSTIterator2(TreeNode root) {
        insertNode(root);
    }

    private void insertNode(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode node = stack.pop();

        if (node.right != null) {
            insertNode(node.right);
        }

        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
