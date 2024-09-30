package com.olivejua.sort;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortListTest {
    InsertionSortList problem;

    @Before
    public void setUp() throws Exception {
        problem = new InsertionSortList();
    }

    @Test
    public void test1() {
        ListNode listNode = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));

        ListNode result = problem.insertionSortList(listNode);

        assertThat(result.val).isEqualTo(1);
        assertThat(result.next.val).isEqualTo(2);
        assertThat(result.next.next.val).isEqualTo(3);
        assertThat(result.next.next.next.val).isEqualTo(4);
    }

    @Test
    public void test2() {
        ListNode listNode = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));

        ListNode result = problem.insertionSortList(listNode);

        assertThat(result.val).isEqualTo(-1);
        assertThat(result.next.val).isEqualTo(0);
        assertThat(result.next.next.val).isEqualTo(3);
        assertThat(result.next.next.next.val).isEqualTo(4);
        assertThat(result.next.next.next.next.val).isEqualTo(5);
    }
}
