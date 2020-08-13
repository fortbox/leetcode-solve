package finished.dp.finished.no416;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1235};
        boolean res = solution.canPartition(nums);
        System.out.println("res = " + res);
    }

    public boolean canPartition(int[] nums) {
        // dp 背包问题
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        sum /= 2;
        boolean[][] dp = new boolean[nums.length][sum + 1];
        if (nums[0] <= sum) {
            dp[0][nums[0]] = true;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i] <= j) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[dp.length - 1][sum];
    }
}