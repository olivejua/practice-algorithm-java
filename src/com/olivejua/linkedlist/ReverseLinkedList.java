package com.olivejua.linkedlist;

/**
 * https://leetcode.com/problems/reverse-linked-list
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ReverseLinkedList problems = new ReverseLinkedList();

        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(5, node1);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(3, node3);
        ListNode node5 = new ListNode(2, node4);
        ListNode node6 = new ListNode(1, node5);

        ListNode result = problems.reverseList2(node6);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode node, ListNode prev) {
        if (node == null) {
            return prev;
        }

        ListNode nextNode = node.next;

        node.next = prev;
        return reverse(nextNode, node);
    }

    public ListNode reverseList2(ListNode head) {
        ListNode node = head, prev = null;

        while (node != null) {
            ListNode nextNode = node.next;

            node.next = prev;

            prev = node;

            node = nextNode;
        }


        return prev;
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
