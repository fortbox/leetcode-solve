package finished.dp.finished.no322;

class Solution {
    public static void main(String[] args) {
        int[] coins = {2};
        int amount = 11;
        int ans = coinChange(coins, amount);
        System.out.println("ans = " + ans);
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        for (int coin : coins) {
            if (coin <= amount) {
                dp[coin] = 1;
            }
        }
        for (int i = 1; i <= amount; i++) {
            if (dp[i] == 1) continue;
            int minStep = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] > 0) {
                    minStep = Math.min(minStep, dp[i - coin]);
                }
            }
            if (minStep < Integer.MAX_VALUE) dp[i] = minStep + 1;
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
}