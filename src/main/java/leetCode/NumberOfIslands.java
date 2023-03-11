package leetCode;

import java.util.Arrays;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islandsCounter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1'){
                    islandsCounter++;
                    spread(i, j, grid);
                }
            }
        }
        return islandsCounter;
    }

    public void spread(int i, int j, char[][] grid){
        if (i == grid.length || i < 0 || j < 0 || j == grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        spread(i-1, j, grid);
        spread(i+1, j, grid);
        spread(i, j+1, grid);
        spread(i, j-1, grid);
    }
}
