package com.olivejua.queue;

public class MyCircularQueue {
    private final Integer[] elements;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        elements = new Integer[k];
        front = 0;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear+1) % elements.length;
        }

        elements[rear] = value;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        elements[front] = null;

        if (size() > 1) {
            front = (front+1) % elements.length;
        } else {
            front = -1;
            rear = -1;
        }

        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return elements[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return elements[rear];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == elements.length;
    }

    int size() {
        if (0 > rear || rear >= elements.length) {
            return 0;
        }

        int rear = this.front > this.rear ? this.rear + elements.length : this.rear;

        return rear - front + 1;
    }
}
