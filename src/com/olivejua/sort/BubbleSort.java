package com.olivejua.sort;

//Enable Full Line suggestions

/**
 * 배열 전체를 쭉 살펴보는 것을 n번 하기 때문에 복잡도는 항상 O(n²)이다.
 * 비효율적인 정렬 알고리즘이며, 구현 가능한 가장 느린 알고리즘이다.
 */
public class BubbleSort {

    public int[] bubbleSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        return A;
    }

}
