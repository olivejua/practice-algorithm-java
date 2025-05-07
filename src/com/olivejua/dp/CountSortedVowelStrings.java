package com.olivejua.dp;

public class CountSortedVowelStrings {

    public int countVowelStrings(int n) {
        int vowels = 5;

        int[][] dp = new int[n][vowels+1];

        for (int i = 0; i < vowels; i++) {
            dp[0][i] = 1;
        }
        dp[0][vowels] = vowels;

        for (int i = 1; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < vowels; j++) {
                if (j==0) {
                    dp[i][j] = dp[i-1][vowels];
                } else {
                    dp[i][j] = dp[i][j-1] - dp[i-1][j-1];
                }

                sum += dp[i][j];
            }

            dp[i][vowels] = sum;
        }

        return dp[n-1][vowels];
    }
}
