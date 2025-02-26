package com.olivejua.greedy;

import java.util.Arrays;

public class MaxIncreaseToKeepCitySkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;

        int[] max_width = new int[n];
        int[] max_height = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max_width[i] = Math.max(max_width[i], grid[i][j]);
                max_height[j] = Math.max(max_height[j], grid[i][j]);
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int skyline = Math.min(max_width[i], max_height[j]);

                result += skyline - grid[i][j];
            }
        }

        return result;
    }
}
