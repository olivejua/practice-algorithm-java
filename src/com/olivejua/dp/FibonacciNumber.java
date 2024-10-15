package com.olivejua.dp;

public class FibonacciNumber {

    public int fib(int n) {
        int[] m = new int[n];

        return tabulation(m, n);
    }

    int memoization(int[] m, int n) {
        if (n <= 1) {
            m[n] = n;
            return n;
        }

        if (m[n] != 0) {
            return m[n];
        }

        m[n] = memoization(m, n-1) + memoization(m, n-2);

        return m[n];
    }

    int tabulation(int[] m, int n) {
        m[0] = 0;
        m[1] = 1;

        for (int i = 2; i <= n; i++) {
            m[i] = m[i-2] + m[i-1];
        }

        return m[n];
    }
}
