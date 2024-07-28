package com.olivejua.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 오름차순 정렬
// low, high, mid 세팅
// 그리디
// 결과 도출

/**
 * https://www.acmicpc.net/problem/2110
 */
public class RouterPlace {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] houses = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        }

        Arrays.sort(houses);

        int low = 1;
        int high = houses[N - 1] - houses[0];
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPlaceRouters(houses, N, C, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(result);
    }

    private static boolean canPlaceRouters(int[] houses, int N, int C, int distance) {
        int count = 1;
        int lastPlaced = houses[0];

        for (int i = 1; i < N; i++) {
            if (houses[i] - lastPlaced >= distance) {
                count++;
                lastPlaced = houses[i];
                if (count == C) return true;
            }
        }

        return false;
    }
}
