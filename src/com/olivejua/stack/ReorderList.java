package com.olivejua.stack;

import java.util.Stack;

public class ReorderList {

    public void reorderList(ListNode head) {
        ListNode lastInHalf = half(head);
        Stack<Integer> stack = makeStack(lastInHalf.next);
        lastInHalf.next = null;

        ListNode node = head;
        while (node != null && !stack.isEmpty()) {
            ListNode next = node.next;
            node.next = new ListNode(stack.pop());
            node.next.next = next;
            node = node.next.next;
        }
    }

    private Stack<Integer> makeStack(ListNode node) {
        Stack<Integer> result = new Stack<>();

        while (node != null) {
            result.push(node.val);
            node = node.next;
        }

        return result;
    }

    ListNode half(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
