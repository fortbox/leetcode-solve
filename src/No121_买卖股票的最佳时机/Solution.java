/**
 * 
 */
package No121_买卖股票的最佳时机;

/**
 * @author jrxiaoweixiang 2018年8月16日
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] prices=new int[]{7,1,5,3,6,4};
		Solution solution=new Solution();
		System.out.println(solution.maxProfit1(prices));

	}

	/**
	 * 遍历两次来判断
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int m = prices[j] - prices[i];
				max=Math.max(m, max);
			}
		}
		return max;
	}
	
	/**
	 * 第二种方法，判断后面的相邻两个相差大于0，才相加，要不然后移。
	 * @param prices
	 * @return
	 */
	public int maxProfit1(int[] prices) {
		int maxProfit = 0;
		int min=prices[0];
		for (int i = 1; i < prices.length; i++) {
			maxProfit=Math.max(maxProfit, prices[i]-min);
			min=Math.min(prices[i], min);
		}
		return maxProfit;
	}
	
	

}
