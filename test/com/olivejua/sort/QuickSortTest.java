package com.olivejua.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    private QuickSort problem;

    @Before
    public void setUp() throws Exception {
        problem = new QuickSort();
    }

    @Test
    public void test1() {
        int[] arr = new int[] {38, 27, 43, 3, 9, 82, 10};

        problem.quickSort(arr, 0, arr.length - 1);
    }
}
