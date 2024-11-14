package com.olivejua.queue;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MyCircularQueueTest {
    private MyCircularQueue problem;

    @Test
    public void test1() {
        problem = new MyCircularQueue(3);

        assertThat(problem.enQueue(1)).isTrue();
        assertThat(problem.enQueue(2)).isTrue();
        assertThat(problem.enQueue(3)).isTrue();
        assertThat(problem.enQueue(4)).isFalse();
        assertThat(problem.Rear()).isEqualTo(3);
        assertThat(problem.isFull()).isTrue();
        assertThat(problem.deQueue()).isTrue();
        assertThat(problem.enQueue(4)).isTrue();
        assertThat(problem.Rear()).isEqualTo(4);
        assertThat(problem.deQueue()).isTrue();
        assertThat(problem.deQueue()).isTrue();
        assertThat(problem.deQueue()).isTrue();
        assertThat(problem.deQueue()).isFalse();
        assertThat(problem.isEmpty()).isTrue();
    }

    @Test
    public void test2() {
        problem = new MyCircularQueue(6);

        assertThat(problem.enQueue(6)).isTrue();
        assertThat(problem.Rear()).isEqualTo(6);
        assertThat(problem.Rear()).isEqualTo(6);
        assertThat(problem.deQueue()).isTrue();
        assertThat(problem.enQueue(5)).isTrue();
        assertThat(problem.Rear()).isEqualTo(5);
        assertThat(problem.deQueue()).isTrue();
        assertThat(problem.Front()).isEqualTo(-1);
        assertThat(problem.deQueue()).isFalse();
        assertThat(problem.deQueue()).isFalse();
        assertThat(problem.deQueue()).isFalse();
    }

    @Test
    public void test_isFull() {
        problem = new MyCircularQueue(3);

        problem.front = 0;
        problem.rear = 2;
        assertThat(problem.isFull()).isTrue();

        problem.front = 1;
        problem.rear = 0;
        assertThat(problem.isFull()).isTrue();

        problem.front = 2;
        problem.rear = 1;
        assertThat(problem.isFull()).isTrue();

        problem.front = 2;
        problem.rear = 2;
        assertThat(problem.isFull()).isFalse();
    }

    @Test
    public void test_size() {
        problem = new MyCircularQueue(3);

        problem.front = 0;
        problem.rear = 0;
        assertThat(problem.size()).isEqualTo(1);

        problem.front = 0;
        problem.rear = 1;
        assertThat(problem.size()).isEqualTo(2);

        problem.front = 0;
        problem.rear = 2;
        assertThat(problem.size()).isEqualTo(3);

        problem.front = 1;
        problem.rear = 1;
        assertThat(problem.size()).isEqualTo(1);

        problem.front = 1;
        problem.rear = 2;
        assertThat(problem.size()).isEqualTo(2);

        problem.front = 1;
        problem.rear = 0;
        assertThat(problem.size()).isEqualTo(3);

        problem.front = 2;
        problem.rear = 2;
        assertThat(problem.size()).isEqualTo(1);

        problem.front = 2;
        problem.rear = 0;
        assertThat(problem.size()).isEqualTo(2);

        problem.front = 2;
        problem.rear = 1;
        assertThat(problem.size()).isEqualTo(3);
    }
}
