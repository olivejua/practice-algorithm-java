package com.olivejua.greedy;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {

    public int maxCoins(int[] piles) {
        int result = 0;

        Arrays.sort(piles);

        int bob = 0;
        int alice = piles.length-1;
        int me = alice-1;
        while (bob < alice && bob < me) {
            result += piles[me];

            bob += 1;
            alice = me-1;
            me = alice-1;
        }

        return result;
    }

    public int maxCoins2(int[] piles) {
        int result = 0;

        Arrays.sort(piles);
        int n = piles.length / 3;

        for (int i = n; i < piles.length; i+=2) {
            result += piles[i];
        }

        return result;
    }


}
