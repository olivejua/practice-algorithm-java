package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class QueueReconstructionByHeightTest {
    private QueueReconstructionByHeight problem = new QueueReconstructionByHeight();

    @Test
    public void test1() {
        int[][] people = {
                {7,0},
                {4,4},
                {7,1},
                {6,0},
                {6,2},
                {5,2}
        };

        int[][] result = problem.reconstructQueue(people);

        assertArrayEquals(new int[]{6, 0}, result[0]);
        assertArrayEquals(new int[]{7, 0}, result[1]);
        assertArrayEquals(new int[]{5, 2}, result[2]);
        assertArrayEquals(new int[]{6, 2}, result[3]);
        assertArrayEquals(new int[]{4, 4}, result[4]);
        assertArrayEquals(new int[]{7, 1}, result[5]);
    }

    @Test
    public void test2() {
        int[][] people = {
                {6,0},
                {5,0},
                {4,0},
                {3,2},
                {2,2},
                {1,4}
        };

        int[][] result = problem.reconstructQueue(people);

        assertArrayEquals(new int[]{4, 0}, result[0]);
        assertArrayEquals(new int[]{5, 0}, result[1]);
        assertArrayEquals(new int[]{2, 2}, result[2]);
        assertArrayEquals(new int[]{3, 2}, result[3]);
        assertArrayEquals(new int[]{1, 4}, result[4]);
        assertArrayEquals(new int[]{6, 0}, result[5]);
    }

    @Test
    public void test3() {
        int[][] people = {
                {7,0},
                {4,4},
                {7,1},
                {6,0},
                {6,2},
                {5,2}
        };

        int[][] result = problem.reconstructQueue2(people);

        assertArrayEquals(new int[]{6, 0}, result[0]);
        assertArrayEquals(new int[]{7, 0}, result[1]);
        assertArrayEquals(new int[]{5, 2}, result[2]);
        assertArrayEquals(new int[]{6, 2}, result[3]);
        assertArrayEquals(new int[]{4, 4}, result[4]);
        assertArrayEquals(new int[]{7, 1}, result[5]);
    }
}
