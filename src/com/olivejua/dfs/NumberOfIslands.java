package com.olivejua.dfs;

/**
 * https://leetcode.com/problems/number-of-islands
 */
public class NumberOfIslands {
    char[][] grid;

    public int numIslands(char[][] grid) {
        int result = 0;

        this.grid = grid;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                result += dfs(i, j);
            }
        }

        return result;
    }

    private int dfs(int x, int y) {
        // x와 y가 둘다 음수이면 안되고, 값이 0이어도 안되고, visited가 true여도 안됨
        if (x < 0 || y < 0 || grid.length <= x || grid[x].length <= y || grid[x][y] == 'x') {
            return 0;
        }

        if (grid[x][y] == '0') {
            grid[x][y] = 'x';
            return 0;
        }

        grid[x][y] = 'x';

        /**
         * 좌 : 0, -1
         * 상 : -1, 0
         * 우 : 0, +1
         * 하 : +1, 0
         */
        dfs(x, y-1);
        dfs(x-1, y);
        dfs(x, y+1);
        dfs(x+1, y);

        return 1;
    }
}
