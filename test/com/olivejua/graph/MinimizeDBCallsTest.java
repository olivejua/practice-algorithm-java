package com.olivejua.graph;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimizeDBCallsTest {

    @Test
    public void test1() {
        int result = MinimizeDBCalls.minimizeTime(4, 2, new int[]{1, 1, 2, 2}, new int[][]{{1, 2}, {3, 4}});

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test2() {
        int result = MinimizeDBCalls.minimizeTime(3, 2, new int[]{1, 2, 2}, new int[][]{{1, 2}, {1, 3}});

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test3() {
        int result = MinimizeDBCalls.minimizeTime(6, 6,
                new int[]{1, 1, 1, 2, 2, 2},
                new int[][]{
                        {1, 2},
                        {2, 3},
                        {4, 5},
                        {5, 6},
                        {1, 4},
                        {2, 5},
                }
        );

        assertThat(result).isEqualTo(2);
    }
}
