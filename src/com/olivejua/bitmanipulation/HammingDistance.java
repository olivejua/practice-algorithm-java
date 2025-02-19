package com.olivejua.bitmanipulation;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int result = x ^ y;

        return Integer.bitCount(result);
    }

    public int hammingDistance2(int x, int y) {
        int count = 0;

        while (x > 0 || y > 0) {
            count += ((x & 1) ^ (y & 1));
            x >>= 1;
            y >>= 1;
        }

        return count;
    }
}
