package com.olivejua.stack;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class MinStack {
    private Element last;
    private Deque<Integer> minStack = new ArrayDeque<>();

    public MinStack() {
    }

    public void push(int val) {
        if (last != null) {
            last = new Element(val, last);

            if (minStack.peek() >= val) {
                minStack.push(val);
            } else {
                minStack.push(minStack.peek());
            }
        } else {
            last = new Element(val);
            minStack.push(val);
        }
    }

    public void pop() {
        last = last.next;
        if (!minStack.isEmpty()) {
            minStack.pop();
        }
    }

    public int top() {
        return last.val;
    }

    public int getMin() {
        return minStack.peek();
    }

    static class Element {
        int val;
        Element next;

        public Element(int val) {
            this.val = val;
        }

        public Element(int val, Element next) {
            this.val = val;
            this.next = next;
        }
    }
}
