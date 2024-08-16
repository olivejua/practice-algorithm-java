package com.olivejua.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] targetNumbers = new int[N];
        for (int i = 0; i < N; i++) {
            targetNumbers[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(targetNumbers);

        int M = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int[] searchNumbers = new int[M];
        StringTokenizer st4 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            searchNumbers[i] = Integer.parseInt(st4.nextToken());
        }

        int[] result = new int[M];
        for (int i = 0; i < result.length; i++) {
            System.out.println(binarySearch(targetNumbers, searchNumbers[i]) ? 1 : 0);
        }
    }

    static boolean binarySearch(int[] targetNumbers, int searchNumber) {
        if (targetNumbers.length == 0) {
            return false;
        }

        int low = 0, high = targetNumbers.length-1;
        while (low <= high) {
            int mid = (high + low) / 2;

            if (searchNumber == targetNumbers[mid]) {
                return true;
            }

            if (searchNumber < targetNumbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
