package com.olivejua.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private BubbleSort problem = new BubbleSort();

    @Test
    public void test1() {
        int[] arr = new int[] {38, 27, 43, 3, 9, 82, 10};

        int[] result = problem.bubbleSort(arr);
    }
}
