package com.olivejua.queue;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MyCircularDequeTest {
    private MyCircularDeque problem;

    @Test
    public void test1() {
        int k = 3;
        problem = new MyCircularDeque(k);

        assertThat(problem.insertLast(1)).isTrue();
        assertThat(problem.insertLast(2)).isTrue();
        assertThat(problem.insertFront(3)).isTrue();
        assertThat(problem.insertFront(4)).isFalse();
        assertThat(problem.getRear()).isEqualTo(2);
        assertThat(problem.isFull()).isTrue();
        assertThat(problem.deleteLast()).isTrue();
        assertThat(problem.insertFront(4)).isTrue();
        assertThat(problem.getFront()).isEqualTo(4);
    }

    @Test
    public void test2() {
        int k = 3;
        problem = new MyCircularDeque(k);

        assertThat(problem.insertLast(1)).isTrue();
        assertThat(problem.insertLast(2)).isTrue();
        assertThat(problem.insertLast(3)).isTrue();
        assertThat(problem.insertLast(4)).isFalse();
        assertThat(problem.deleteFront()).isTrue();
        assertThat(problem.deleteFront()).isTrue();
        assertThat(problem.deleteFront()).isTrue();
        assertThat(problem.insertLast(4)).isTrue();
        assertThat(problem.insertLast(4)).isTrue();
    }

    @Test
    public void test3() {
        int k = 3;
        problem = new MyCircularDeque(k);

        assertThat(problem.insertFront(8)).isTrue();
        assertThat(problem.insertLast(8)).isTrue();
        assertThat(problem.insertLast(2)).isTrue();
        assertThat(problem.getFront()).isEqualTo(8);
        assertThat(problem.deleteLast()).isTrue();
        assertThat(problem.getRear()).isEqualTo(8);
        assertThat(problem.insertFront(9)).isTrue();
        assertThat(problem.deleteFront()).isTrue();
        assertThat(problem.getRear()).isEqualTo(8);
        assertThat(problem.insertLast(2)).isTrue();
        assertThat(problem.isFull()).isTrue();
    }
}
