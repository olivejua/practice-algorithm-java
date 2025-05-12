package com.olivejua.dp;

public class PartitionArrayForMaximumSum {

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[][] dp = new int[arr.length][k];

        int first_row_max = arr[0];
        for (int i = 0; i < k; i++) {
            first_row_max = Math.max(first_row_max, arr[i]);

            dp[0][i] = first_row_max * (i+1);
        }

        for (int i = 1; i < arr.length; i++) {
            int basic_sum = dp[i-1][0];

            int range_maxNum = arr[i];
            for (int j = 0; j < k; j++) {
                if (i+j >= arr.length) {
                    break;
                }

                range_maxNum = Math.max(range_maxNum, arr[i+j]);

                if (j == k-1) {
                    dp[i][j] = basic_sum + (range_maxNum * (j+1));
                } else {
                    dp[i][j] = Math.max(basic_sum + (range_maxNum * (j+1)), dp[i-1][j+1]);
                }
            }
        }

        return dp[arr.length-1][0];
    }
}
