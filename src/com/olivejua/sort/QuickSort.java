package com.olivejua.sort;

public class QuickSort {

    public int[] quickSort(int[] A, int lo, int hi) {
        if (lo < hi) {
            int pivot = partition(A, lo, hi);
            quickSort(A, lo, pivot-1);
            quickSort(A, pivot+1, hi);
        }

        return A;
    }

    public int partition(int[] A, int lo, int hi) {
        int pivot = A[hi];
        int left = lo;

        for (int right = lo; right < hi; right++) {
            if (A[right] < pivot) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
            }
        }

        int temp = A[left];
        A[left] = A[hi];
        A[hi] = temp;
        return left;
    }
}
