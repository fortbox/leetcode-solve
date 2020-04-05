/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No714_买卖股票的最佳时机含手续费;

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        //状态机
        int cash = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
