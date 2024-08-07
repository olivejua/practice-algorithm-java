package com.olivejua.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIFThereIsValidPathInGrid {
    // up&down, left&right
    int[][][] DIRECTIONS = {
            {},
            {{0, -1}, {0, 1}},  // left, right
            {{-1, 0}, {1, 0}},  // up, down
            {{0, -1}, {1, 0}},  // left, down
            {{0, 1}, {1, 0}},   // right, down
            {{0, -1}, {-1, 0}}, // left, up
            {{0, 1}, {-1, 0}}   // right, up
    };

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int i = cell[0], j = cell[1];

            if (i == m - 1 && j == n - 1) {
                return true;
            }

            int type = grid[i][j];
            for (int[] direction : DIRECTIONS[type]) {
                int ni = i + direction[0];
                int nj = j + direction[1];

                if (ni >= 0 && ni < m && nj >= 0 && nj < n && !visited[ni][nj]) {
                    int nextType = grid[ni][nj];
                    for (int[] back : DIRECTIONS[nextType]) {
                        if (i == ni + back[0] && j == nj + back[1]) {
                            visited[ni][nj] = true;
                            queue.add(new int[] {ni, nj});
                        }
                    }
                }
            }
        }

        return false;
    }
}
