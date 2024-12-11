package com.olivejua.bfs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class FindElementsTest {
    private FindElements problem;

    @Test
    public void test1() {
        TreeNode root = new TreeNode(-1,
                null,
                new TreeNode(-1));

        problem = new FindElements(root);

        assertThat(problem.find(1)).isFalse();
        assertThat(problem.find(2)).isTrue();
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(-1,
                new TreeNode(-1,
                        new TreeNode(-1),
                        new TreeNode(-1)),
                new TreeNode(-1));

        problem = new FindElements(root);

        assertThat(problem.find(1)).isTrue();
        assertThat(problem.find(3)).isTrue();
        assertThat(problem.find(5)).isFalse();
    }
}
