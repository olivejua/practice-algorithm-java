package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class TreeTraversalPracticeTest {
    TreeTraversalPractice treeTraversal;

    @Before
    public void setUp() throws Exception {
        treeTraversal  = new TreeTraversalPractice();
    }

    @Test
    public void test1() {
        TreeTraversalPractice.TreeNode root = createTree();

        treeTraversal.preOrder(root);
        List<Character> result = treeTraversal.getVisit();
        assertThat(result).containsExactly('F', 'B', 'A', 'D', 'C', 'E', 'G', 'I', 'H');
    }

    @Test
    public void test2() {
        TreeTraversalPractice.TreeNode root = createTree();

        treeTraversal.interactivePreorder(root);
        List<Character> result = treeTraversal.getVisit();
        assertThat(result).containsExactly('F', 'B', 'A', 'D', 'C', 'E', 'G', 'I', 'H');
    }

    @Test
    public void test3() {
        TreeTraversalPractice.TreeNode root = createTree();

        treeTraversal.inorder(root);
        List<Character> result = treeTraversal.getVisit();
        assertThat(result).containsExactly('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I');
    }

    private static TreeTraversalPractice.TreeNode createTree() {
        return new TreeTraversalPractice.TreeNode(
                'F',
                new TreeTraversalPractice.TreeNode('B',
                        new TreeTraversalPractice.TreeNode('A'),
                        new TreeTraversalPractice.TreeNode('D',
                                new TreeTraversalPractice.TreeNode('C'),
                                new TreeTraversalPractice.TreeNode('E'))),
                new TreeTraversalPractice.TreeNode('G',
                        null,
                        new TreeTraversalPractice.TreeNode('I',
                                new TreeTraversalPractice.TreeNode('H'),
                                null)));
    }
}