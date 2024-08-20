package com.olivejua.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountCompleteTreeNodesTest {
    private CountCompleteTreeNodes problem = new CountCompleteTreeNodes();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        null));

        int result = problem.countNodes(root);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void test2() {
        TreeNode root = null;

        int result = problem.countNodes(root);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);

        int result = problem.countNodes(root);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        null));

        TreeNode result = problem.insertNode(root, 7);
        System.out.println(result);
    }
}
