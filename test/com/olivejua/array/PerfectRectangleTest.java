package com.olivejua.array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectRectangleTest {
    private PerfectRectangle problem = new PerfectRectangle();

    @Test
    public void test1() {
        boolean result = problem.isRectangleCover2(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {3, 2, 4, 4},
                {1, 3, 2, 4},
                {2, 3, 3, 4}
        });

        System.out.println("result = " + result);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void test2() {
        boolean result = problem.isRectangleCover2(new int[][]{
                {1, 1, 2, 3},
                {1, 3, 2, 4},
                {3, 1, 4, 2},
                {3, 2, 4, 4}
        });

        System.out.println("result = " + result);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void test3() {
        boolean result = problem.isRectangleCover2(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {1, 3, 2, 4},
                {2, 2, 4, 4}
        });

        System.out.println("result = " + result);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void test4() {
        boolean result = problem.isRectangleCover2(new int[][]{
                {0, 0, 1, 1},
                {0, 1, 3, 2},
                {1, 0, 2, 2}
        });

        System.out.println("result = " + result);
        Assertions.assertThat(result).isFalse();
    }
}