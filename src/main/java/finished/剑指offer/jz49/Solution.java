/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz49;

class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int idx_2 = 0, idx_3 = 0, idx_5 = 0;
        for (int i = 1; i < n; i++) {
            int a = 2 * dp[idx_2];
            int b = 3 * dp[idx_3];
            int c = 5 * dp[idx_5];
            dp[i] = Math.min(a, Math.min(b, c));
            if (a == dp[i]) idx_2++;
            if (b == dp[i]) idx_3++;
            if (c == dp[i]) idx_5++;
        }
        return dp[n - 1];
    }
}
