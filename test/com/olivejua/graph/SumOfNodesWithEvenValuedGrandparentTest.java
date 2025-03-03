package com.olivejua.graph;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNodesWithEvenValuedGrandparentTest {
    private final SumOfNodesWithEvenValuedGrandparent problem = new SumOfNodesWithEvenValuedGrandparent();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(6,
                new TreeNode(7,
                        new TreeNode(2,
                                new TreeNode(9),
                                null),
                        new TreeNode(7,
                                new TreeNode(1),
                                new TreeNode(4))),
                new TreeNode(8,
                        new TreeNode(1),
                        new TreeNode(3,
                                null,
                                new TreeNode(5))));

        int result = problem.sumEvenGrandparent(root);

        Assertions.assertThat(result).isEqualTo(18);
    }
}
