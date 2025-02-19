package com.olivejua.bitMasking;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int result = x ^ y;

        return Integer.bitCount(result);
    }
}
