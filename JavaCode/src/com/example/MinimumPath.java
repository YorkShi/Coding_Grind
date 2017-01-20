package com.example;

/**
 * Created by Isaac on 1/20/17.
 */
public class MinimumPath {
    public static int miniPath(int[][] grid){
        int result = grid[0][0];
        int i = 0, j = 0;
        int x = grid.length - 1;
        int y = grid[0].length - 1;

        if(y == 0 && x == 0){
            return result;
        }
        TestMain.log(x);
        TestMain.log(y);

        while(i < x || j < y){
            if(i == x && j < y){
                result += grid[i][j+1];
                j++;
            }else if(i < x && j == y){
                result += grid[i+1][j];
                i++;
            }else if(i < x && j < y){
                if(grid[i+1][j] <= grid[i][j+1]){
                    result += grid[i+1][j];
                    i++;
                }else{
                    result += grid[i][j+1];
                    j++;
                }
            }
        }

        return result;
    }
}
