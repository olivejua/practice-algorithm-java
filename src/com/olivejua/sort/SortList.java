package com.olivejua.sort;

public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // 1. 재귀로 반을 쪼갠다. 다음이 없는 오롯이 하나가 될 때까지.
        // 2. 하나가 되면 그걸 리턴한다.
        // 3. 리턴된거는 정렬된거라고 보고, 두 ListNode를 정렬한다. (요소만큼 반복 정렬)

        ListNode half = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            half = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        half.next = null;

        ListNode listNode1 = sortList(head);
        ListNode listNode2 = sortList(slow);

        return mergeTwoLists(listNode1, listNode2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
