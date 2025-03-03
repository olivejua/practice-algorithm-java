package com.olivejua.graph;

import java.util.ArrayList;
import java.util.List;

public class SumOfNodesWithEvenValuedGrandparent {
    int result = 0;

    public int sumEvenGrandparent(TreeNode root) {
//        dfs(root, new ArrayList<>(), 0);
        dfs2(root, false, false);

        return result;
    }

    private void dfs(TreeNode node, List<Integer> parents, int index) {
        if (node == null) {
            return;
        }

        if (index >= 2 && (parents.get(index-2) % 2 == 0)) {
            result += node.val;
        }

        parents.add(index, node.val);
        dfs(node.left, parents, index+1);
        dfs(node.right, parents, index+1);
        parents.remove(index);
    }

    private void dfs2(TreeNode node, boolean evenValuedParent, boolean evenValuedGrandParent) {
        if (node == null) {
            return;
        }

        if (evenValuedGrandParent) {
            result += node.val;
        }

        dfs2(node.left, node.val % 2 == 0, evenValuedParent);
        dfs2(node.right, node.val % 2 == 0, evenValuedParent);
    }
}
