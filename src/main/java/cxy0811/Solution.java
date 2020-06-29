/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy0811;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        int ans = solution.waysToChange(n);
        System.out.println("ans = " + ans);
    }

    public int waysToChange(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int[] coins = {1, 5, 10, 25};
        for (int c = 0; c < 4; ++c) {
            int coin = coins[c];
            for (int i = coin; i <= n; ++i) {
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        }
        return dp[n] % 1000000007;
    }
}
