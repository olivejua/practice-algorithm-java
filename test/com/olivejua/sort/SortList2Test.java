package com.olivejua.sort;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortList2Test {
    private SortList2 problem;

    @Before
    public void setUp() throws Exception {
        problem = new SortList2();
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(-1,
                new ListNode(5,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(0)))));

        ListNode result = problem.sortList(head);
        Assertions.assertThat(result.val).isEqualTo(-1);
        Assertions.assertThat(result.next.val).isEqualTo(0);
        Assertions.assertThat(result.next.next.val).isEqualTo(3);
        Assertions.assertThat(result.next.next.next.val).isEqualTo(4);
        Assertions.assertThat(result.next.next.next.next.val).isEqualTo(5);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(4,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3))));

        ListNode result = problem.sortList(head);
        Assertions.assertThat(result.val).isEqualTo(1);
        Assertions.assertThat(result.next.val).isEqualTo(2);
        Assertions.assertThat(result.next.next.val).isEqualTo(3);
        Assertions.assertThat(result.next.next.next.val).isEqualTo(4);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode();

        ListNode result = problem.sortList(head);
        Assertions.assertThat(result.val).isEqualTo(0);
    }
}
