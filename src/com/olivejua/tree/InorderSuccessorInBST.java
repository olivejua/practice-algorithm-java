package com.olivejua.tree;

public class InorderSuccessorInBST {
    boolean find;

    public int inorderSuccessor(Node root, Node x) {
        if (root == null) {
            return -1;
        }

        Node result = inorder(root, x);
        return result != null ? result.data : -1;
    }

    Node inorder(Node root, Node x) {
        if (root == null) {
            return null;
        }

        Node left = inorder(root.left, x);
        if (find && left != null) {
            return left;
        }

        if (find) {
            return root;
        }

        if (root.data == x.data) {
            find = true;
        }

        Node right = inorder(root.right, x);
        if (find && right != null) {
            return right;
        }

        return null;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
        }

        Node (int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
