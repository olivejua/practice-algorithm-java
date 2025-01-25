package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;

public class InsertIntervalTest {
    private final InsertInterval problem = new InsertInterval();

    @Test
    public void test1() {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {2,5};

        int[][] result = problem.insert(intervals, newInterval);

        assertArrayEquals(new int[]{1, 5}, result[0]);
        assertArrayEquals(new int[]{6, 9}, result[1]);
    }

    @Test
    public void test2() {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};

        int[][] result = problem.insert(intervals, newInterval);

        assertArrayEquals(new int[]{1,2}, result[0]);
        assertArrayEquals(new int[]{3,10}, result[1]);
        assertArrayEquals(new int[]{12,16}, result[2]);
    }

    @Test
    public void test3() {
        int[][] intervals = {{3,3}, {6,9}};
        int[] newInterval = {1,2};

        int[][] result = problem.insert(intervals, newInterval);

        assertArrayEquals(new int[]{1, 2}, result[0]);
        assertArrayEquals(new int[]{3, 3}, result[1]);
        assertArrayEquals(new int[]{6, 9}, result[2]);
    }

    @Test
    public void test4() {
        int[][] intervals = {{2,3}, {6,9}};
        int[] newInterval = {10,12};

        int[][] result = problem.insert(intervals, newInterval);

        assertArrayEquals(new int[]{2, 3}, result[0]);
        assertArrayEquals(new int[]{6, 9}, result[1]);
        assertArrayEquals(new int[]{10, 12}, result[2]);
    }

    @Test
    public void test5() {
        int[][] intervals = {};
        int[] newInterval = {10,12};

        int[][] result = problem.insert(intervals, newInterval);

        assertArrayEquals(new int[]{10, 12}, result[0]);
    }

    @Test
    public void test6 () {
        int[][] intervals = {{3,5}, {12,15}};
        int[] newInterval = {6,6};

        int[][] result = problem.insert(intervals, newInterval);

        assertArrayEquals(new int[]{3, 5}, result[0]);
        assertArrayEquals(new int[]{6, 6}, result[1]);
        assertArrayEquals(new int[]{12, 15}, result[2]);
    }
}