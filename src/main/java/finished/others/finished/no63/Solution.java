/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no63;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (obstacleGrid[i][j] == 0) {
                    if (i > 0 && j > 0) {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    } else if (i == 0 && j > 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (i > 0 && j == 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = 1;
                    }
                }
            }
        }
        return dp[row - 1][col - 1];
    }
}
