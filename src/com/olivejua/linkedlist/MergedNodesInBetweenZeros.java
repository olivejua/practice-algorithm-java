package com.olivejua.linkedlist;

public class MergedNodesInBetweenZeros {

    public ListNode mergeNodes(ListNode head) {
        int currentNodeSum = 0;

        ListNode left = head;
        ListNode right = head.next;
        while (right != null) {
            if (right.val == 0) {
                left.next = new ListNode(currentNodeSum);
                left = left.next;
                currentNodeSum = 0;
            } else {
                currentNodeSum += right.val;
            }
            right = right.next;
        }

        return head.next;
    }
}
