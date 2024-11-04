package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class ConvertSortedListToBinarySearchTreeTest {
    private final ConvertSortedListToBinarySearchTree problem = new ConvertSortedListToBinarySearchTree();

    @Test
    public void test1() {
        ListNode head = new ListNode(-10,
                new ListNode(-3,
                        new ListNode(0,
                                new ListNode(5,
                                        new ListNode(9)))));

        TreeNode result = problem.sortedListToBST(head);

        assertThat(result.val).isEqualTo(0);
        assertThat(result.left.val).isEqualTo(-3);
        assertThat(result.left.left.val).isEqualTo(-10);
        assertThat(result.left.right).isNull();
        assertThat(result.right.val).isEqualTo(9);
        assertThat(result.right.left.val).isEqualTo(5);
        assertThat(result.right.right).isNull();
    }

    @Test
    public void test2() {
        ListNode head = null;

        TreeNode result = problem.sortedListToBST(head);

        assertThat(result).isNull();
    }
}
