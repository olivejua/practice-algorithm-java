package com.olivejua.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파스칼의_삼각형 {
    static int[][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        memo = new int[n+1][n+1];
        System.out.printf("dp[%d, %d] = %d\n", n, c, dp(n, c));
    }

    static int dp(int row, int column) {
        memo[row][1] = 1;
        memo[row][row] = 1;

        if (memo[row][column] == 0) {
            memo[row][column] = dp(row-1, column-1) + dp(row-1, column);
        }

        return memo[row][column];
    }
}
