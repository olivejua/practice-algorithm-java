package com.olivejua.sort;

public class QuickSort {

    public int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

        return arr;
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int left = low;
        for (int right = low; right < high; right++) {
            if (arr[right] < pivot) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        int temp = arr[left];
        arr[left] = arr[high];
        arr[high] = temp;
        return left;
    }
}
