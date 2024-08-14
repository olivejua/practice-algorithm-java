package com.olivejua.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken()); // 나무의 수
        int targetWood = Integer.parseInt(st1.nextToken()); // 필요한 나무의 길이

        int[] trees = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(trees);

        int min = 0, max = trees[N-1];
        int result = 0;

        while (min < max) {
            int mid = (max + min) / 2;

            if (canCutEnoughWood(trees, mid, targetWood)) {
                result = mid;
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        System.out.println(result);
    }

    private static boolean canCutEnoughWood(int[] trees, int cutHeight, int targetWood) {
        long totalWood = 0;

        for (int tree : trees) {
            if (tree > cutHeight) {
                totalWood += tree - cutHeight;
            }
        }

        return totalWood >= targetWood;
    }
}
