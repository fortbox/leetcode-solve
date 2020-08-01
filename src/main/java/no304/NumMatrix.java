package no304;

class NumMatrix {
    private int row;
    private int col;
    private int[][] dp;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0) return;
        row = matrix.length;
        col = matrix[0].length;
        dp = new int[row][col + 1];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 1; j <= matrix[0].length; j++) dp[i][j] = dp[i][j - 1] + matrix[i][j - 1];
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for (int i = row1; i <= row2; i++) ans += dp[i][col2 + 1] - dp[i][col1];
        return ans;
    }
}
