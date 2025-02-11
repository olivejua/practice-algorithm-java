package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class TaskScheduler2Test {
    private final TaskScheduler2 problem = new TaskScheduler2();

    @Test
    public void test1() {
        char[] tasks = new char[] {
                'A', 'A', 'A', 'B', 'B', 'B'
        };

        int result = problem.leastInterval(tasks, 2);

        assertThat(result).isEqualTo(8);
    }
}
