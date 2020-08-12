package no464;

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int n = 1 << maxChoosableInteger;
        Boolean[] dp = new Boolean[n];
        if (maxChoosableInteger >= desiredTotal) return true;
        int tmp = 0;
        for (int i = 1; i <= maxChoosableInteger; i++) {
            tmp += i;
        }
        if (tmp < desiredTotal) return false;
        return dfs(maxChoosableInteger, desiredTotal, dp, 0);
    }

    private boolean dfs(int m, int d, Boolean[] dp, int stat) {
        if (d <= 0) return false;
        if (dp[stat] != null) return dp[stat];
        for (int i = 1; i <= m; i++) {
            int tmp = 1 << i;
            if ((tmp & stat) == 0) {
                if (d - i <= 0 || !dfs(m, d - i, dp, tmp | stat)) {
                    dp[stat] = true;
                    return true;
                }
            }
        }
        dp[stat] = false;
        return false;
    }
}
