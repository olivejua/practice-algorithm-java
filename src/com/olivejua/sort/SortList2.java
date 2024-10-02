package com.olivejua.sort;

public class SortList2 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode half = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            half = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        half.next = null;

        ListNode sl1 = sortList(head);
        ListNode sl2 = sortList(slow);

        return merge(sl1, sl2);
    }

    ListNode merge(ListNode sl1, ListNode sl2) {
        ListNode parent = new ListNode();
        ListNode p = parent;

        while (sl1 != null && sl2 != null) {
            if (sl1.val < sl2.val) {
                p.next = sl1;
                sl1 = sl1.next;
            } else {
                p.next = sl2;
                sl2 = sl2.next;
            }

            p = p.next;
        }

        if (sl1 == null) {
            p.next = sl2;
        }

        if (sl2 == null) {
            p.next = sl1;
        }

        return parent.next;
    }
}