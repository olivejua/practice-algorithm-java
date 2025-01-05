package com.olivejua.tree;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeLevelOrderTraversal2Test {
    private final BinaryTreeLevelOrderTraversal2 problem = new BinaryTreeLevelOrderTraversal2();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        List<List<Integer>> result = problem.levelOrder(root);

        assertThat(result.size()).isEqualTo(3);
        assertThat(result).containsExactlyElementsOf(List.of(
                List.of(3),
                List.of(9,20),
                List.of(15,7)
        ));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> result = problem.levelOrder(root);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result).containsExactlyElementsOf(List.of(
                List.of(1)
        ));
    }

    @Test
    public void test3() {
        List<List<Integer>> result = problem.levelOrder(null);

        assertThat(result.size()).isEqualTo(0);
        assertThat(result).containsExactlyElementsOf(List.of(
        ));
    }
}