package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TaskSchedulerTest {
    private TaskScheduler problem = new TaskScheduler();

    @Test
    public void test1() {
        char[] tasks = {'A', 'A', 'A', 'B', 'C', 'D'};
        int n = 2;

        int result = problem.leastInterval(tasks, n);

        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test2() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;

        int result = problem.leastInterval(tasks, n);

        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    public void test3() {
        char[] tasks = {'A', 'C', 'A', 'B', 'D', 'B'};
        int n = 1;

        int result = problem.leastInterval(tasks, n);

        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    public void test4() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 3;

        int result = problem.leastInterval(tasks, n);

        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void test5() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E'};
        int n = 2;

        int result = problem.leastInterval2(tasks, n);

        Assertions.assertThat(result).isEqualTo(12);
    }
}
