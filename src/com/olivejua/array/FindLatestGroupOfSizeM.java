package com.olivejua.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-latest-group-of-size-m/description/
 */
public class FindLatestGroupOfSizeM {

    public int findLatestStep(int[] arr, int m) {
        int n = arr.length; // 5

        int[] length = new int[n + 2];
        int[] count = new int[n + 1];
        int result = -1;

        // length = [0,6,5,3,3,5,6,0]
        // count = [-5,0,0,0,0,0,1]
        for (int i = 0; i < n; i++) {
            int index = arr[i]; //1
            int left = length[index - 1]; //0
            int right = length[index + 1]; //5
            int totalLength = left + right + 1; //6

            length[index] = totalLength;
            length[index - left] = totalLength;
            length[index + right] = totalLength;

            count[left]--;
            count[right]--;
            count[totalLength]++;

            if (count[m] > 0) {
                result = i + 1;
            }
        }

        return result;
    }
}
