package com.olivejua.linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        PalindromeLinkedList problem = new PalindromeLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
//        ListNode node3 = new ListNode(3, node2);
//        ListNode node4 = new ListNode(2, node3);
//        ListNode node5 = new ListNode(1, node4);

        boolean palindrome = problem.isPalindrome2(node2);
        System.out.println("palindrome = " + palindrome);
    }

    boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode node = head;
        while (node != null) {
            stack.add(node.val);
            node = node.next;
        }


        while (!stack.empty() && head != null) {
            if (stack.pop() != head.val) {
                return false;
            }

            head = head.next;
        }

        return true;
    }

    boolean isPalindrome2(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();

        ListNode node = head;
        while (node != null) {
            deque.add(node.val);
            node = node.next;
        }

        while (deque.size() >= 2) {
            Integer pollFirst = deque.pollFirst();
            Integer pollLast = deque.pollLast();
            if (pollFirst != pollLast) {
                return false;
            }
        }

        return true;
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


