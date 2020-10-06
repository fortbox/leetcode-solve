/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.dp.finished.no576;

class Solution {
    public int findPaths(int m, int n, int N, int i, int j) {
        // 这是一道dfs的题吧, 看了解答，是dp，三维dp
        if (N <= 0) return 0;
        int mod = 1000000007;
        int[][][] dp = new int[m][n][N + 1];
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int k = 1; k <= N; k++) {
            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    for (int[] dir : dirs) {
                        int new_x = x + dir[0];
                        int new_y = y + dir[1];
                        if (new_x < 0 || new_x >= m || new_y < 0 || new_y >= n) {
                            dp[x][y][k] += 1;
                        } else {
                            dp[x][y][k] = (dp[x][y][k] + dp[new_x][new_y][k - 1]) % mod;
                        }
                    }

                }
            }
        }
        return dp[i][j][N];
    }
}
