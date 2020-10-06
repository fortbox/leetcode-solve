/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.dp.finished.no673;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 4, 7};
        int res = solution.findNumberOfLIS(nums);
        System.out.println("res = " + res);
    }

    public int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[][] dp = new int[nums.length][2];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 1);
        }
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    if (dp[j][0] + 1 > dp[i][0]) {
                        dp[i][0] = dp[j][0] + 1;
                        dp[i][1] = dp[j][1];
                    } else if (dp[j][0] + 1 == dp[i][0]) {
                        dp[i][1] += dp[j][1];
                    }
                }
                tmp = Math.max(tmp, dp[i][0]);
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println("i = " + i);
            System.out.println("Arrays.toString(dp[i]) = " + Arrays.toString(dp[i]));
        }
        int finalTmp = tmp;
        return Arrays.stream(dp).filter(o1 -> o1[0] == finalTmp).map(o1 -> o1[1]).reduce(0, Integer::sum);
    }
}