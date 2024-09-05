package com.olivejua.dp;

public class FibonacciNumber {
    int[] dp = new int[31];

    public int fib(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return n;
        }

        return fib(n - 2) + fib(n - 1);
    }

    //메모제이션
    public int fib2(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            dp[n] = n;
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fib2(n - 2) + fib2(n - 1);
        return dp[n];
    }

    //타뷸레이션
    public int fib3(int n) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }
}
