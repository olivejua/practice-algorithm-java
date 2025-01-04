package com.olivejua.linkedlist;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PartitionListTest {
    private final PartitionList problem = new PartitionList();

    @Test
    public void test1() {
        ListNode head = new ListNode(1,
                new ListNode(4,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(2))))));

        int x = 3;

        ListNode result = problem.partition(head, x);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.next.val).isEqualTo(2);
        assertThat(result.next.next.val).isEqualTo(2);
        assertThat(result.next.next.next.val).isEqualTo(4);
        assertThat(result.next.next.next.next.val).isEqualTo(3);
        assertThat(result.next.next.next.next.next.val).isEqualTo(5);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(2, new ListNode(1));

        int x = 2;

        ListNode result = problem.partition(head, x);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.next.val).isEqualTo(2);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(3,
                new ListNode(5,
                        new ListNode(8,
                                new ListNode(5,
                                        new ListNode(10,
                                                new ListNode(2,
                                                        new ListNode(1)))))));

        int x = 5;

        ListNode result = problem.partition(head, x);

        assertThat(result.val).isEqualTo(3);
        assertThat(result.next.val).isEqualTo(2);
        assertThat(result.next.next.val).isEqualTo(1);
        assertThat(result.next.next.next.val).isEqualTo(5);
        assertThat(result.next.next.next.next.val).isEqualTo(8);
        assertThat(result.next.next.next.next.next.val).isEqualTo(5);
        assertThat(result.next.next.next.next.next.next.val).isEqualTo(10);
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(1, new ListNode(1));

        int x = 2;

        ListNode result = problem.partition(head, x);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.next.val).isEqualTo(1);
    }
}