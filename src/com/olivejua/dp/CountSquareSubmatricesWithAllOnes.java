package com.olivejua.dp;

public class CountSquareSubmatricesWithAllOnes {

    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    continue;
                }

                // left, left-top, top
                int min = Math.min(matrix[i][j-1], Math.min(matrix[i-1][j-1], matrix[i-1][j]));
                matrix[i][j] = min + 1;
            }
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += matrix[i][j];
            }
        }

        return result;
    }
}
