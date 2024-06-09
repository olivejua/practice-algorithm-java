package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static com.olivejua.tree.MaximumDepthOfBinaryTree.*;

public class MaximumDepthOfBinaryTreeTest {
    private final MaximumDepthOfBinaryTree PROBLEM = new MaximumDepthOfBinaryTree();

    @Test
    public void test1() {
        TreeNode leftIn2D = new TreeNode(9);
        TreeNode rightIn2D = new TreeNode(10, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, leftIn2D, rightIn2D);

        int result = PROBLEM.maxDepthBFS(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));

        int result = PROBLEM.maxDepthBFS(root);

        Assertions.assertThat(result).isEqualTo(2);
    }
}