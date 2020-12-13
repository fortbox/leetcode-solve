/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no79;

class Solution {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        Solution solution = new Solution();
        boolean res = solution.exist(board, word);
        System.out.println("res = " + res);
    }

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;
        if (row * col < word.length()) return false;
        boolean[][] dp = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                boolean f = dfs(board, dp, word, i, j, 0);
                if (f) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] dp, String s, int i, int j, int index) {
        if (index == s.length()) return true;
        if (i >= board.length || i < 0 || j < 0 || j >= board[0].length || s.charAt(index) != board[i][j] || dp[i][j])
            return false;
        dp[i][j] = true;
        if (dfs(board, dp, s, i + 1, j, index + 1) || dfs(board, dp, s, i - 1, j, index + 1) || dfs(board, dp, s, i, j - 1, index + 1) || dfs(board, dp
                , s, i, j + 1, index + 1)) return true;
        dp[i][j] = false;
        return false;
    }

}