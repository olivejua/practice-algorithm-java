package com.olivejua.binarysearch;

import com.olivejua.binarysearch.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PathSum2Test {
    private final PathSum2 PROBLEM = new PathSum2();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(
                5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(1))));
        int targetSum = 22;

        List<List<Integer>> result = PROBLEM.pathSum(root, targetSum);
        Assertions.assertThat(result.size()).isEqualTo(2);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3));
        int targetSum = 5;

        List<List<Integer>> result = PROBLEM.pathSum(root, targetSum);
        Assertions.assertThat(result.size()).isEqualTo(0);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                null);
        int targetSum = 0;

        List<List<Integer>> result = PROBLEM.pathSum(root, targetSum);
        Assertions.assertThat(result.size()).isEqualTo(0);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                null);
        int targetSum = 1;

        List<List<Integer>> result = PROBLEM.pathSum(root, targetSum);
        Assertions.assertThat(result.size()).isEqualTo(0);
    }
}