package com.olivejua.queue;

public class MyCircularDeque {
    private final Integer[] elements;
    int front;
    int rear;

    public MyCircularDeque(int k) {
        elements = new Integer[k];
        front = -1;
        rear = -1;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = front > 0 ? front-1 : elements.length-1;
        }

        elements[front] = value;

        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % elements.length;
        }

        elements[rear] = value;

        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        elements[front] = null;

        if (size() == 1) {
            front = -1;
            rear = -1;
        } else {
            front = front < elements.length-1 ? front+1 : 0;
        }

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        elements[rear] = null;

        if (size() == 1) {
            front = -1;
            rear = -1;
        } else {
            rear = rear > 0 ? rear-1 : elements.length-1;
        }

        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return elements[front];
    }

    public int getRear() {
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
        if (front == -1) {
            return 0;
        }

        int rear = this.rear < this.front ? this.rear + elements.length : this.rear;
        return rear - front + 1;
    }
}
