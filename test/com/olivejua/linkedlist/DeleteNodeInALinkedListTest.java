package com.olivejua.linkedlist;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteNodeInALinkedListTest {
    private final DeleteNodeInALinkedList problem = new DeleteNodeInALinkedList();

    @Test
    public void test1() {
        ListNode node = new ListNode(5, new ListNode(1, new ListNode(9)));
        ListNode head = new ListNode(4, node);

        problem.deleteNode(node);

        assertThat(head.val).isEqualTo(4);
        assertThat(head.next.val).isEqualTo(1);
        assertThat(head.next.next.val).isEqualTo(9);
    }
}