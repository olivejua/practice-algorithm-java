package com.olivejua.dfs;

import java.io.IOException;
import java.util.Scanner;

public class PermutationCycle {
    static int[] arr;
    static boolean[] visited;
    static int n;
    static int[] counts;
    static int currentCount;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        counts = new int[tc];

        for (int i = 0; i < tc; i++) {
            n = scan.nextInt();
            arr = new int[n + 1];
            visited = new boolean[n + 1];

            for (int j = 1; j < n+1; j++) {
                arr[j] = scan.nextInt();
            }

            for (int j = 1; j < n+1; j++) {
                if (!visited[j]) {
                    dfs(j);
                }
            }

            counts[i] = currentCount;
            currentCount = 0;
        }

        for (int i = 0; i < tc; i++) {
            System.out.println(counts[i]);
        }
    }

    static void dfs(int idx) {
        visited[idx] = true;

        if (visited[arr[idx]]) {
            currentCount++;
            return;
        }

        dfs(arr[idx]);
    }
}
