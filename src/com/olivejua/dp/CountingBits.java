package com.olivejua.dp;

public class CountingBits {

    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int lastBit = i & 1;
            ans[i] = ans[i>>1] + lastBit;
        }

        return ans;
    }
}
