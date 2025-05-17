package com.olivejua.tree;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeTest {
    private FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree problem;

    @Before
    public void setUp() throws Exception {
        problem = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();
    }

    @Test
    public void test1() {
        TreeNode target = new TreeNode(3,
                new TreeNode(6),
                new TreeNode(19));
        TreeNode original = new TreeNode(
                7,
                new TreeNode(4),
                target);

        TreeNode expected = new TreeNode(3,
                new TreeNode(6),
                new TreeNode(19));
        TreeNode cloned = new TreeNode(
                7,
                new TreeNode(4),
                expected);

        TreeNode result = problem.getTargetCopy(original, cloned, target);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void test2() {
        TreeNode target = new TreeNode(7);
        TreeNode original = target;

        TreeNode expected = new TreeNode(7);
        TreeNode cloned = expected;

        TreeNode result = problem.getTargetCopy(original, cloned, target);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void test3() {
        TreeNode target = new TreeNode(4,
                null,
                new TreeNode(3,
                        null,
                        new TreeNode(2,
                                null,
                                new TreeNode(1))));
        TreeNode original = new TreeNode(8,
                null,
                new TreeNode(6,
                        null,
                        new TreeNode(5,
                                null,
                                target)));

        TreeNode expected = new TreeNode(4,
                null,
                new TreeNode(3,
                        null,
                        new TreeNode(2,
                                null,
                                new TreeNode(1))));
        TreeNode cloned = new TreeNode(8,
                null,
                new TreeNode(6,
                        null,
                        new TreeNode(5,
                                null,
                                expected)));;

        TreeNode result = problem.getTargetCopy(original, cloned, target);

        assertThat(result).isEqualTo(expected);
    }
}
