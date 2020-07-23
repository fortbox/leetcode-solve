package jz63;

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        boolean canBuy=true;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0]=Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            if (dp[i][0]==dp[i-1][1]) canBuy=false;
           if (canBuy){
               dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
           }else {
               dp[i][1]=dp[i-1][1];
           }
        }
        return dp[len-1][0];
    }
}