package finished.dp.finished.no375;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.getMoneyAmount(3);
        System.out.println("res = " + res);
    }

    public int getMoneyAmount(int n) {
        // 实在没有思路，参考下其他人的解答
        int[][] dp = new int[n + 2][n + 2];
//        for (int i = n; i >= 1; i--) {
//            for (int j = i; j <= n; j++) {
//                if (i == j) {
//                    dp[i][j] = 0;
//                } else {
//                    dp[i][j] = Integer.MAX_VALUE;
//                    for (int x = i; x <= j; x++) {
//                        dp[i][j] = Math.min(dp[i][j], Math.max(dp[i][x - 1], dp[x + 1][j]) + 1);
//                    }
//                }
//            }
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                if (i == j) {
                    dp[j][i] = 0;
                } else {
                    dp[j][i] = Integer.MAX_VALUE;
                    for (int x = j; x <= i; x++) {
                        dp[j][i] = Math.min(dp[j][i], Math.max(dp[j][x - 1], dp[x + 1][i]) + x);
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
            System.out.println("Arrays.toString(dp[i]) = " + Arrays.toString(dp[i]));
        }
        return dp[1][n];
    }
}
