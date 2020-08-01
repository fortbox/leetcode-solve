package no152;

class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            dp[i] = t;
            for (int j = i - 1; j >= 0; j--) {
                t *= nums[j];
                dp[i] = Math.max(dp[i], t);

            }
            if (dp[i] > ans) ans = dp[i];
        }
        return ans;
    }
}