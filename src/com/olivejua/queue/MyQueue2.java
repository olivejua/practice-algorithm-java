package com.olivejua.queue;

import java.util.Stack;
import java.util.concurrent.DelayQueue;

public class MyQueue2 {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public MyQueue2() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return !out.isEmpty() ? out.pop() : -1;
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return !out.isEmpty() ? out.peek() : -1;
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
