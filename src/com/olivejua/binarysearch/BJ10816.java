package com.olivejua.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int[] cards = new int[N];

        StringTokenizer nLine = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(nLine.nextToken());
        }

        int M = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int[] mCards = new int[M];
        StringTokenizer mLine = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            mCards[i] = Integer.parseInt(mLine.nextToken());
        }

        System.out.println(Arrays.toString(solveByMap(N, cards, M, mCards))
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
        );
    }

    static int[] solveByMap(int n, int[] cards, int m, int[] mCards) {
        Map<Integer, Integer> cardNumbers = new HashMap<>();

        for (int card : cards) {
            Integer numbers = cardNumbers.getOrDefault(card, 0);
            cardNumbers.put(card, numbers+1);
        }

        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = cardNumbers.getOrDefault(mCards[i], 0);
        }

        return result;
    }
}
