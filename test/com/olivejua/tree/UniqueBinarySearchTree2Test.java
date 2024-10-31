package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UniqueBinarySearchTree2Test {
    private UniqueBinarySearchTree2 problem = new UniqueBinarySearchTree2();

    @Test
    public void test1() {
        int n = 3;

        List<TreeNode> result = problem.generateTrees(n);

        Assertions.assertThat(result.size()).isEqualTo(5);
    }
}
