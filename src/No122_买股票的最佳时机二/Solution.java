package No122_买股票的最佳时机二;

public class Solution {

	public static void main(String[] args) {
		int[] prices = new int[] { 1, 2, 3, 3, 5,6 };
		Solution solution = new Solution();
		System.out.println(solution.maxProfit(prices));

	}

	/**
	 * 有收益就相加
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int max = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] >= prices[i - 1]) {
				max = max + prices[i] -prices[i - 1];
			}
		}
		return max;
	}

}
