/*
 * Copyright (c) 2019
 * @Author:xiaoweixiang
 */

package dp.No62_不同路径;

class Solution {
    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        int res = uniquePaths(m, n);
        System.out.println("res = " + res);
    }

    public static int uniquePaths(int m, int n) {
        /**
         * 这道题太简单了
         */
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else if (i > 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j > 0) {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
