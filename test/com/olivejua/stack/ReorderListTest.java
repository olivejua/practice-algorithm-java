package com.olivejua.stack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderListTest {
    private final ReorderList problem = new ReorderList();

    @Test
    public void test1() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        problem.reorderList(head);

        Assertions.assertThat(head.val).isEqualTo(1);
        Assertions.assertThat(head.next.val).isEqualTo(4);
        Assertions.assertThat(head.next.next.val).isEqualTo(2);
        Assertions.assertThat(head.next.next.next.val).isEqualTo(3);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        problem.reorderList(head);

        Assertions.assertThat(head.val).isEqualTo(1);
        Assertions.assertThat(head.next.val).isEqualTo(5);
        Assertions.assertThat(head.next.next.val).isEqualTo(2);
        Assertions.assertThat(head.next.next.next.val).isEqualTo(4);
        Assertions.assertThat(head.next.next.next.next.val).isEqualTo(3);
    }
}
