package com.olivejua.sort;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {
    private Runner problem;

    @Before
    public void setUp() throws Exception {
        problem = new Runner();
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7,
                                                                new ListNode(8))))))));

        ListNode result = problem.findMiddleNode(head);
        Assertions.assertThat(result.val).isEqualTo(4);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7)))))));

        ListNode result = problem.findMiddleNode(head);
        Assertions.assertThat(result.val).isEqualTo(4);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6))))));

        ListNode result = problem.findMiddleNode(head);
        Assertions.assertThat(result.val).isEqualTo(3);
    }
}
