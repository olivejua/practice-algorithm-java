package com.olivejua.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_증가하는_부분_수열 {
    static int[] cnt;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        cnt = new int[n];
        cnt[0] = 1;
        for (int i = 1; i < n; i++) {
            cnt[i] = 1;

            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && cnt[i] <= cnt[j]) {
                    cnt[i] = cnt[j] + 1;
                }
            }

            System.out.printf("numbers[%d]: %d, cnt[%d]: %d\n", i, numbers[i], i, cnt[i]);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, cnt[i]);
        }

        System.out.println(max);
    }
}
