package com.olivejua.dfs;

public class NumberOfIslands2 {

    public int numIslands(char[][] grid) {
        int result = 0;

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == '1') {
                    dfs(grid, x, y);
                    result++;
                }
            }
        }

        return result;
    }

    private void dfs(char[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length ||
                y < 0 || y >= grid[x].length ||
                grid[x][y] != '1') {
            return;
        }

        grid[x][y] = 0;

        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x+1, y);
        dfs(grid, x, y-1);
    }

}
