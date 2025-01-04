package com.olivejua.linkedlist;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = null;
        ListNode leftHead = null;
        ListNode right = null;
        ListNode rightHead = null;

        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                if (left == null) {
                    left = cur;
                    leftHead = cur;
                } else {
                    left.next = cur;
                    left = left.next;
                }
            } else {
                if (right == null) {
                    right = cur;
                    rightHead = cur;
                } else {
                    right.next = cur;
                    right = right.next;
                }
            }

            cur = cur.next;
        }

        if (left != null) {
            left.next = null;
        }
        if (right != null) {
            right.next = null;
        }

        if (leftHead == null) {
            return rightHead;
        }

        left.next = rightHead;

        return leftHead;
    }
}
