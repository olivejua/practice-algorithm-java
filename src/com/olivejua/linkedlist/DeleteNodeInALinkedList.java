package com.olivejua.linkedlist;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
