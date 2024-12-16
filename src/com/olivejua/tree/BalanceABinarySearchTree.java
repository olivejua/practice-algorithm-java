package com.olivejua.tree;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {
    public TreeNode balanceBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);

        return buildBalanceBinarySearchTree(list, 0, list.size()-1);
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }

    private TreeNode buildBalanceBinarySearchTree(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = buildBalanceBinarySearchTree(list, start, mid-1);
        node.right = buildBalanceBinarySearchTree(list, mid+1, end);

        return node;
    }
}
