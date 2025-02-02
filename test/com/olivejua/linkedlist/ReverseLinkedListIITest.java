package com.olivejua.linkedlist;

import org.junit.Test;

public class ReverseLinkedListIITest {
    private final ReverseLinkedListII problem = new ReverseLinkedListII();

    @Test
    public void test1() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        int left = 2, right = 4;

        ListNode result = problem.reverseBetween(head, left, right);

        System.out.println("result = " + result);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(5);

        int left = 1, right = 1;

        ListNode result = problem.reverseBetween(head, left, right);

        System.out.println("result = " + result);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7)))))));

        int left = 2, right = 6;

        ListNode result = problem.reverseBetween2(head, left, right);

        System.out.println("result = " + result);
    }
}
