package com.olivejua.stack;

import java.util.Objects;
import java.util.Stack;

public class MinStack2 implements MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack2() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || minStack.peek() >= stack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        Integer value = stack.pop();

        if (value.equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
