/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no276;

class Solution {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        int res = numWays(n, k);
        System.out.println("res = " + res);
    }

    public static int numWays(int n, int k) {
        /**
         * dp[i]=dp[i-2]*(k-1)+dp[i-1]*(k-1);
         */
        if (n == 0 || k == 0) return 0;
        int[] dp = new int[n];
        if (n == 1) return k;
        if (n == 2) return k * k;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[0] = k;
            } else if (i == 1) {
                dp[1] = k * k;
            } else {
                dp[i] = dp[i - 2] * (k - 1) + dp[i - 1] * (k - 1);
            }
        }
        return dp[n - 1];
    }
}