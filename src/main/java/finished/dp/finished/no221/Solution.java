package finished.dp.finished.no221;

class Solution {
    public int maximalSquare(char[][] matrix) {
        /**
         * 参考了其他人的思路，很精彩！
         */
        int r = matrix.length;
        if (r == 0) return 0;
        int c = matrix[0].length;
        int[][] dp = new int[r + 1][c + 1];
        int largestSide = 0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                    largestSide = Math.max(largestSide, dp[i][j]);
                }
            }
        }
        return largestSide * largestSide;
    }
}