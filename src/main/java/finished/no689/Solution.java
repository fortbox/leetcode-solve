/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no689;

public class Solution {
    // 参考其他人解答，自己想了半天终于明白
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int len = nums.length;
        int t = len - k + 1;
        int[] sums = new int[t];
        int[] res = new int[3];
        for (int i = 0; i < k; i++) {
            sums[0] += nums[i];
        }
        for (int i = 1; i < t; i++) {
            sums[i] = sums[i - 1] - nums[i - 1] + nums[i + k - 1];
        }
        int[][] dp = new int[t][4];
        int[][] path = new int[t][4];

        dp[0][1] = sums[0];
        path[0][1] = 0;

        for (int i = 1; i < t; i++) {
            dp[i][1] = Math.max(dp[i - 1][1], sums[i]);
            path[i][1] = sums[i] > dp[i - 1][1] ? i : path[i - 1][1];
        }
        for (int i = 0; i < t; i++) {
            for (int j = 2; j < 4; j++) {
                if (i >= (j - 1) * k) {
                    int select = dp[i - k][j - 1] + sums[i];
                    int notSelect = dp[i - 1][j];
                    dp[i][j] = Math.max(select, notSelect);
                    path[i][j] = path[i - 1][j];
                    if (select > notSelect) {
                        path[i][j] = i;
                    }
                }
            }
        }
        res[2] = path[t - 1][3];
        res[1] = path[res[2] - k][2];
        res[0] = path[res[1] - k][1];
        return res;
    }
}
