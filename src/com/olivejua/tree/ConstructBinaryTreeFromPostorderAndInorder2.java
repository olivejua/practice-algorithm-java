package com.olivejua.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructBinaryTreeFromPostorderAndInorder2 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> inorderList = new ArrayList<>();
        Arrays.stream(inorder).forEach(inorderList::add);

        List<Integer> postorderList = new ArrayList<>();
        Arrays.stream(postorder).forEach(postorderList::add);

        return makeTree(inorderList, postorderList);
    }

    private TreeNode makeTree(List<Integer> inorder, List<Integer> postorder) {
        if (postorder.isEmpty()) {
            return null;
        }

        Integer val = postorder.remove(postorder.size() - 1);
        int rootIdx = inorder.indexOf(val);

        if (rootIdx == -1) {
            return null;
        }

        TreeNode root = new TreeNode(val);
        if (rootIdx < inorder.size()-1) {
            root.right = makeTree(inorder.subList(rootIdx+1, inorder.size()), postorder);
        }

        if (rootIdx > 0) {
            root.left = makeTree(inorder.subList(0, rootIdx), postorder);
        }

        return root;
    }
}
