package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiameterOfBinaryTreeTest {
    private final DiameterOfBinaryTree PROBLEM = new DiameterOfBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(
                1
                , new TreeNode(
                        2
                        , new TreeNode(4)
                        , new TreeNode(5))
                , new TreeNode(3));

        int result = PROBLEM.diameterOfBinaryTree(root);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(
                1
                , new TreeNode(2)
                , null);

        int result = PROBLEM.diameterOfBinaryTree(root);

        Assertions.assertThat(result).isEqualTo(1);
    }
}