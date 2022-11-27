package com.olivejua.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수열 {
    static int fibCnt = 0;
    static int dpCnt = 0;
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.printf("fib(%d) = %d\n", n, fib(n));
        System.out.printf("fib(%d)'s count = %d\n", n, fibCnt);

        memo = new int[n+1];
        System.out.printf("dp(%d) = %d\n", n, dp(n));
        System.out.printf("dp(%d)'s count = %d\n", n, dpCnt);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            ++fibCnt;
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    static int dp(int n) {
        memo[1] = 1;
        memo[2] = 1;

        if (memo[n] == 0) {
            ++dpCnt;
            memo[n] = dp(n - 1) + dp(n - 2);
        }

        return memo[n];
    }
}
