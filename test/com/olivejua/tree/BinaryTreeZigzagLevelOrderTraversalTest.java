package com.olivejua.tree;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeZigzagLevelOrderTraversalTest {
    private final BinaryTreeZigzagLevelOrderTraversal problem = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        List<List<Integer>> result = problem.zigzagLevelOrder(root);

        assertThat(result.size()).isEqualTo(3);
        assertThat(result).containsExactlyElementsOf(List.of(
                List.of(3),
                List.of(20,9),
                List.of(15,7)
        ));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> result = problem.zigzagLevelOrder(root);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result).containsExactlyElementsOf(List.of(
                List.of(1)
        ));
    }

    @Test
    public void test3() {
        TreeNode root = null;

        List<List<Integer>> result = problem.zigzagLevelOrder(root);

        assertThat(result.size()).isEqualTo(0);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        new TreeNode(4),
                        null),
                new TreeNode(3,
                        null,
                        new TreeNode(5)));

        List<List<Integer>> result = problem.zigzagLevelOrder(root);

        assertThat(result.size()).isEqualTo(3);
        assertThat(result).containsExactlyElementsOf(List.of(
                List.of(3),
                List.of(3,2),
                List.of(4,5)
        ));
    }
}
