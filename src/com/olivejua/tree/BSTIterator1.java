package com.olivejua.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BSTIterator1 {
    private final Deque<TreeNode> queue = new ArrayDeque<>();

    public BSTIterator1(TreeNode root) {
        insertByInorder(root);
    }

    private void insertByInorder(TreeNode node) {
        if (node == null) {
            return;
        }

        insertByInorder(node.left);
        queue.add(node);
        insertByInorder(node.right);
    }

    public int next() {
        return queue.poll().val;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
