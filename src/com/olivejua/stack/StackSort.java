package com.olivejua.stack;

import java.util.Stack;

public class StackSort {
    private Stack<Integer> stack;

    public StackSort() {
        stack = new Stack<>();
    }

    void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
        }

        if (stack.peek() < x) {
            Integer pop = stack.pop();
            push(x);
            stack.push(pop);

        } else {
            stack.push(x);
        }
    }

    int pop() {
        return stack.pop();
    }

    int peek() {
        return stack.peek();
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }
}
