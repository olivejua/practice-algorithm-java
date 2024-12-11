package com.olivejua.bfs;

import java.util.HashSet;
import java.util.Set;

public class FindElements {
    private final TreeNode root;
    private final Set<Integer> values = new HashSet<>();

    public FindElements(TreeNode root) {
        initialize(root, 0);

        this.root = root;
    }

    private void initialize(TreeNode node, int value) {
        if (node == null) {
            return;
        }

        node.val = value;
        values.add(value);
        initialize(node.left, value * 2 + 1);
        initialize(node.right, value * 2 + 2);
    }

    public boolean find(int target) {
//        return find(root, target);
        return values.contains(target);
    }

    private boolean find(TreeNode node, int target) {
        if (node == null) {
            return false;
        }

        return ((node.val == target) || (find(node.left, target)) || (find(node.right, target)));
    }
}
