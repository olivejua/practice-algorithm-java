package com.olivejua.tree;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode dfs(int preIndex, int inStart, int inEnd, int[] preorder, int[] inorder) {
        // 예외 처리
        if (preIndex > preorder.length - 1 || inStart > inEnd) {
            return null;
        }

        // 전위 순회 값이 중위 순회에서는 몇 번째 인덱스인지 추출
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preIndex]) {
                inIndex = i;
            }
        }

        // 해당 인덱스는 중위 순회를 분할하는 노드로 지정
        TreeNode node = new TreeNode(inorder[inIndex]);
        // 전위 순회 다음 결괄ㄹ 보도록 인덱스 +1
        preIndex++;
        // 왼쪽 자식 노드부터 진행
        node.left = dfs(preIndex, inStart, inIndex - 1, preorder, inorder);
        // 나머지 값으로 오른쪽 자식 노드 진행
        node.right = dfs(preIndex + inIndex - inStart, inIndex + 1, inEnd, preorder, inorder);

        return node;
    }
}
