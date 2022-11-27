package com.olivejua.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_증가하는_부분_수열 {
    static int[] numbers;
    static Integer[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        numbers = new int[n];
        memo = new Integer[n];

        for (int i = 1; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            dp(i);
        }

        int max = memo[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, memo[i]);
        }

        System.out.println(max);
    }

    static int dp(int maxIdx) {
        if (memo[maxIdx] == null) {
            memo[maxIdx] = 1;

            for (int i = maxIdx - 1; i >= 0; i--) {
                if (numbers[i] < numbers[maxIdx]) {
                    memo[maxIdx] = Math.max(memo[maxIdx], dp(i) + 1);
                }
            }
        }

        return memo[maxIdx];
    }
}
