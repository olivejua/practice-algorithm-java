package com.olivejua.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeTwoBinaryTreesTest {
    private final MergeTwoBinaryTrees PROBLEMS = new MergeTwoBinaryTrees();

    @Test
    public void test1() {
        TreeNode root1 = new TreeNode(
                1
                , new TreeNode(
                        4
                        , new TreeNode(5)
                        , null)
                , new TreeNode(2)
        );

        TreeNode root2 = new TreeNode(
                2
                , new TreeNode(
                    1
                    , null
                    , new TreeNode(4)
                )
                , new TreeNode(
                        3
                        , null
                        , new TreeNode(7)
                )
        );

        TreeNode result = PROBLEMS.mergeTrees(root1, root2);

        assertThat(result.val).isEqualTo(3);

        TreeNode leftNode = result.left;
        TreeNode rightNode = result.right;
        assertThat(leftNode.val).isEqualTo(5);
        assertThat(rightNode.val).isEqualTo(5);

        leftNode = result.left.left;
        rightNode = result.left.right;
        assertThat(leftNode.val).isEqualTo(5);
        assertThat(rightNode.val).isEqualTo(4);
        assertThat(leftNode.left).isNull();
        assertThat(leftNode.right).isNull();
        assertThat(rightNode.left).isNull();
        assertThat(rightNode.right).isNull();

        leftNode = result.right.left;
        rightNode = result.right.right;
        assertThat(leftNode).isNull();
        assertThat(rightNode.val).isEqualTo(7);
        assertThat(rightNode.left).isNull();
        assertThat(rightNode.right).isNull();
    }

    @Test
    public void test2() {
        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(
                1
                , new TreeNode(2)
                , null);

        TreeNode result = PROBLEMS.mergeTrees(root1, root2);

        assertThat(result.val).isEqualTo(2);

        assertThat(result.left.val).isEqualTo(2);
        assertThat(result.right).isNull();

        assertThat(result.left.left).isNull();
        assertThat(result.left.right).isNull();
    }
}