package com.olivejua.dfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FlattenBinaryTreeToLinkedListTest {
    private FlattenBinaryTreeToLinkedList problem = new FlattenBinaryTreeToLinkedList();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(5,
                        null,
                        new TreeNode(6)));

        problem.flatten(root);

        assertThat(root.val).isEqualTo(1);
        assertThat(root.left).isNull();
        assertThat(root.right.val).isEqualTo(2);
        assertThat(root.right.right.val).isEqualTo(3);
        assertThat(root.right.right.right.val).isEqualTo(4);
        assertThat(root.right.right.right.right.val).isEqualTo(5);
        assertThat(root.right.right.right.right.right.val).isEqualTo(6);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(5,
                        null,
                        new TreeNode(6)));

        problem.flatten(root);

        assertThat(root.val).isEqualTo(1);
        assertThat(root.left).isNull();
        assertThat(root.right.val).isEqualTo(2);
        assertThat(root.right.right.val).isEqualTo(3);
        assertThat(root.right.right.right.val).isEqualTo(4);
        assertThat(root.right.right.right.right.val).isEqualTo(5);
        assertThat(root.right.right.right.right.right.val).isEqualTo(6);
    }

    @Test
    public void test3() {
        TreeNode root = null;

        problem.flatten(root);

        assertThat(root).isNull();
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(0);

        problem.flatten(root);

        assertThat(root.val).isEqualTo(0);
    }
}
