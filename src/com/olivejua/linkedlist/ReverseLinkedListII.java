package com.olivejua.linkedlist;

import java.util.*;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Deque<ListNode> stack = new ArrayDeque<>();

        int mid = left + (right-left) / 2;

        ListNode leftNode = null;

        ListNode node = head;
        int idx = 1;
        while (node != null && idx <= right) {
            if (idx == left) {
                leftNode = node;
            }

            if (idx > mid) {
                stack.push(node);
            }

            node = node.next;
            idx++;
        }

        while (!stack.isEmpty()) {
            ListNode rightNode = stack.pop();

            int temp = rightNode.val;
            rightNode.val = leftNode.val;
            leftNode.val = temp;

            leftNode = leftNode.next;
            idx++;
        }

        return head;
    }

    public ListNode reverseBetween2(ListNode head, int left, int right) {
        ListNode h = new ListNode(0);
        h.next = head;

        ListNode prev = h;
        for (int i = 0; i < left-1; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return h.next;
    }
}
