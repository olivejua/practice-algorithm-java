package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FindDuplicateSubtreesTest {
    FindDuplicateSubtrees problem = new FindDuplicateSubtrees();

    @Test
    public void serializeTest1() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2,
                        new TreeNode(4),
                        null),
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(4),
                                null),
                        new TreeNode(4)));

        String result = problem.serialize(root);

        assertThat(result).isEqualTo("1,2,3,4,#,2,4,#,#,4");
    }

    @Test
    public void findDuplicateSubtrees1() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2,
                        new TreeNode(4),
                        null),
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(4),
                                null),
                        new TreeNode(4)));

        List<TreeNode> result = problem.findDuplicateSubtrees(root);

        assertThat(result.size()).isEqualTo(2);
        System.out.println(result);
    }

    @Test
    public void findDuplicateSubtrees2() {
        TreeNode root = new TreeNode(
                2,
                new TreeNode(1),
                new TreeNode(1));

        List<TreeNode> result = problem.findDuplicateSubtrees(root);

        assertThat(result.size()).isEqualTo(1);
        System.out.println(result);
    }

    @Test
    public void findDuplicateSubtrees3() {
        TreeNode root = new TreeNode(
                2,
                new TreeNode(2,
                        new TreeNode(3),
                        null),
                new TreeNode(2,
                        new TreeNode(3),
                        null));

        List<TreeNode> result = problem.findDuplicateSubtrees(root);

        assertThat(result.size()).isEqualTo(2);
        System.out.println(result);
    }

    @Test
    public void findDuplicateSubtrees4() {
        TreeNode root = new TreeNode(
                2,
                new TreeNode(1,
                        new TreeNode(11),
                        null),
                new TreeNode(11,
                        new TreeNode(1),
                        null));

        List<TreeNode> result = problem.findDuplicateSubtrees(root);

        assertThat(result.size()).isEqualTo(0);
        System.out.println(result);
    }
}