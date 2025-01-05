package com.olivejua.tree;

import org.junit.Before;
import org.junit.Test;

import static com.olivejua.tree.InorderSuccessorInBST.Node;
import static org.assertj.core.api.Assertions.assertThat;

public class InorderSuccessorInBSTTest {
    private InorderSuccessorInBST problem;

    @Before
    public void setUp() throws Exception {
        problem = new InorderSuccessorInBST();
    }

    @Test
    public void test1() {
        Node root = new Node(2,
                new Node(1),
                new Node(3));

        int result = problem.inorderSuccessor(root, new Node(2));

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        Node root = new Node(20,
                new Node(8,
                        new Node(4),
                        new Node(12,
                                new Node(10),
                                new Node(14))),
                new Node(22));

        int result = problem.inorderSuccessor(root, new Node(8));

        assertThat(result).isEqualTo(10);
    }

    @Test
    public void test3() {
        Node root = new Node(2,
                new Node(1),
                new Node(3));

        int result = problem.inorderSuccessor(root, new Node(3));

        assertThat(result).isEqualTo(-1);
    }
}