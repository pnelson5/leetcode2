package com.nelson.app;

public class MaxArea {
    public int maxAreaOfIsland(int[][] grid) {
        int biggest = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++){
                // Look for an island to process
                if (grid[r][c] == 1) {
                    int area = dfs(r, c, grid, 0);
                    biggest = Math.max(biggest, area);
                }
            }
        }
        return biggest;
    }
    
    public int dfs(int r, int c, int[][] grid, int a) {
        a++;
        grid[r][c] = 2;
        if (r >= 1 && grid[r-1][c] == 1) {
            a = dfs(r-1, c, grid, a);
        }
        
        if (r < grid.length - 1 && grid[r+1][c] == 1) {
            a = dfs(r+1, c, grid, a);
        }
        
        if (c >= 1 && grid[r][c-1] == 1) {
            a = dfs(r, c-1, grid, a);
        }
        
        if (c < grid[r].length - 1 && grid[r][c+1] == 1) {
            a = dfs(r, c+1, grid, a);
        }
        
        return a;
    }
}
