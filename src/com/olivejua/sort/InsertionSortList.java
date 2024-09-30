package com.olivejua.sort;

/**
 * https://leetcode.com/problems/insertion-sort-list
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        ListNode parent = new ListNode();
        ListNode p = parent;

        while (head != null) {
            while (true) {
                if (p.next == null) {
                    p.next = new ListNode(head.val);
                    break;
                }

                if (head.val <= p.next.val) {
                    ListNode insert = new ListNode(head.val);
                    ListNode pNext = p.next;
                    p.next = insert;
                    insert.next = pNext;
                    break;
                }

                p = p.next;
            }

            head = head.next;
            p = parent;
        }

        return parent.next;
    }

    public ListNode insertionSortList2(ListNode head) {
        ListNode parent = new ListNode();
        ListNode p = parent;

        while (head != null) {
            while (p.next != null && p.next.val < head.val) {
                p = p.next;
            }

            ListNode headNext = head.next;
            ListNode pNext = p.next;

            p.next = head;
            head.next = pNext;

            head = headNext;
            p = parent;
        }

        return parent.next;
    }
}
