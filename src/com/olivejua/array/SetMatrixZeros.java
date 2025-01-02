package com.olivejua.array;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

    public void setZeroes(int[][] matrix) {
        Set<Integer> zeroX = new HashSet<>();
        Set<Integer> zeroY = new HashSet<>();

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                if (matrix[x][y] == 0) {
                    zeroX.add(x);
                    zeroY.add(y);
                }
            }
        }

        for (Integer x : zeroX) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = 0;
            }
        }

        for (Integer y : zeroY) {
            for (int x = 0; x < matrix.length; x++) {
                matrix[x][y] = 0;
            }
        }
    }
}
