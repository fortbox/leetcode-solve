/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.dp.finished.no650;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 12;
        int ans = solution.minSteps(n);
        System.out.println("ans = " + ans);
    }

    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j <= 2; j++) {
                if (i % j == 0) dp[i] = Math.min(dp[i], dp[j] + dp[i / j]);
            }
        }
        return dp[n];
    }
}
