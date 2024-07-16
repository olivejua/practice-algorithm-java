package com.olivejua.sort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static com.olivejua.sort.SortList.ListNode;
import static org.assertj.core.api.Assertions.*;

public class SortListTest {
    private final SortList sortList = new SortList();

    @Test
    public void solution1() {
        ListNode head = new ListNode(
                -1,
                new ListNode(5,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(0)))));

        ListNode result = sortList.sortList(head);

        assertThat(result.val).isEqualTo(-1);
        assertThat(result.next.val).isEqualTo(0);
        assertThat(result.next.next.val).isEqualTo(3);
        assertThat(result.next.next.next.val).isEqualTo(4);
        assertThat(result.next.next.next.next.val).isEqualTo(5);
    }
}