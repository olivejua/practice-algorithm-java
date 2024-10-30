package com.olivejua.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal2 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList = new ArrayList<>();
        Arrays.stream(preorder)
                .forEach(preorderList::add);

        List<Integer> inorderList = new ArrayList<>();
        Arrays.stream(inorder)
                .forEach(inorderList::add);

        return makeTree(preorderList, inorderList);
    }

    private TreeNode makeTree(List<Integer> preorder, List<Integer> inorder) {
        if (preorder.isEmpty()) {
            return null;
        }

        Integer val = preorder.remove(0);

        int rootIdx = inorder.indexOf(val);
        if (rootIdx == -1) {
            return null;
        }

        TreeNode root = new TreeNode(val);
        if (rootIdx > 0) {
            root.left = makeTree(preorder, inorder.subList(0, rootIdx));
        }
        if (rootIdx < inorder.size()-1) {
            root.right = makeTree(preorder, inorder.subList(rootIdx+1, inorder.size()));
        }

        return root;
    }
}
