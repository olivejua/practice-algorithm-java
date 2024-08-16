package com.olivejua.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());

        Set<Integer> A = new HashSet<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st2.nextToken());
            A.add(number);
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st3.nextToken());

        StringTokenizer st4 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st4.nextToken());
            System.out.println(A.contains(number) ? 1 : 0);
        }
    }
}
