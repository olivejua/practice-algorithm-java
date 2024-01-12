package com.olivejua.linkedlist;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists problems = new MergeTwoSortedLists();

        ListNode list1_node1 = new ListNode(4);
        ListNode list1_node2 = new ListNode(2, list1_node1);
        ListNode list1_node3 = new ListNode(1, list1_node2);

        ListNode list2_node1 = new ListNode(4);
        ListNode list2_node2 = new ListNode(3, list2_node1);
        ListNode list2_node3 = new ListNode(1, list2_node2);

        ListNode result = problems.mergeTwoLists(list1_node3, list2_node3);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

