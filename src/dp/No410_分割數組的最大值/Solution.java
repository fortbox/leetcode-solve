/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package dp.No410_分割數組的最大值;

public class Solution {
    public int splitArray(int[] nums, int m) {
        /**
         * 参考官方解题的如何建立dp数组
         * dp数组建立了，一切就简单了
         */
        int[][] dp = new int[nums.length + 1][m + 1];
        int[] record = new int[nums.length];
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < nums.length + 1; i++) {
            record[i + 1] = nums[i] + record[i];
        }
        dp[0][0] = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 0; k < i; k++) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[k][j - 1], record[i] - record[k]));
                }
            }

        }
        return dp[nums.length][m];
    }
}
