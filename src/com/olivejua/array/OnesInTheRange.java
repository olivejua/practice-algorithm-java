package com.olivejua.array;

//Facbook
public class OnesInTheRange {
    final int[] arr; // ex 1
    final int[] accumulated;

    public OnesInTheRange(int[] arr) {
        // implementation
        this.arr = arr;
        accumulated = new int[arr.length];

        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                current++;
            }

            accumulated[i] = current;
        }
    }

    public int numOfOnes(int s, int e) {
        // implementation
        return (accumulated[e] + 1) - accumulated[s];
    }

}
