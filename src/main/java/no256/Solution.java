/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no256;

class Solution {
    public static void main(String[] args) {
        int[][] costs = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        int res = minCost(costs);
        System.out.println("res = " + res);
    }

    public static int minCost(int[][] costs) {
        if (costs.length == 0) return 0;
        /**
         * dp
         */
        int[][] dp = new int[costs.length][3];
        for (int i = 0; i < costs.length; i++) {
            if (i == 0) {
                dp[i][0] = costs[i][0];
                dp[i][1] = costs[i][1];
                dp[i][2] = costs[i][2];
            } else {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
            }
        }
        return getMin(dp[dp.length - 1][0], dp[dp.length - 1][1], dp[dp.length - 1][2]);
    }

    private static int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
