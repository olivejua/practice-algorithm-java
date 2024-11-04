package com.olivejua.tree;

public class ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode mid = middleNode(head);

        if (mid.next == null) {
            return new TreeNode(mid.val);
        }

        ListNode rootListNode = mid.next;
        ListNode rightListNode = mid.next.next;
        mid.next = null;

        TreeNode root = new TreeNode(rootListNode.val);

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(rightListNode);

        return root;
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }
}
