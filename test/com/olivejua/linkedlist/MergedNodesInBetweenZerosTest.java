package com.olivejua.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MergedNodesInBetweenZerosTest {
    private final MergedNodesInBetweenZeros problem = new MergedNodesInBetweenZeros();

    @Test
    public void test1() {
        ListNode head = new ListNode(0,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(0,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(2,
                                                                new ListNode(0))))))));

        ListNode result = problem.mergeNodes(head);

        assertThat(result.val).isEqualTo(4);
        assertThat(result.next.val).isEqualTo(11);
        assertThat(result.next.next).isNull();
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(0,
                new ListNode(1,
                        new ListNode(0,
                                new ListNode(3,
                                        new ListNode(0,
                                                new ListNode(2,
                                                        new ListNode(2,
                                                                new ListNode(0))))))));

        ListNode result = problem.mergeNodes(head);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.next.val).isEqualTo(3);
        assertThat(result.next.next.val).isEqualTo(4);
    }
}
