package No198_打家劫舍;

import java.util.Arrays;

public class Solution {
	private long calltimes = 0;

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		Solution solution = new Solution();
		int[] nums = new int[] { 104, 209, 137, 52, 158, 67, 213, 86, 141, 110, 151, 127, 238, 147, 169, 138, 240, 185,
				246, 225, 147, 203, 83, 83, 131, 227, 54, 78, 165, 180, 214, 151, 111, 161, 233, 147, 124, 143 };
		int n = solution.rob3(nums);
		System.out.println(n);

		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间： " + (endTime - startTime) + "ms");

	}

	/**
	 * 动态规划 dynamic programming<br/>
	 * <参考网上的思路> 以下内容摘自网上，感觉很有意思。<br/>
	 * 哎，现在真是打劫也得会算法写代码，不然那都赚不到钱！很简单的一个动态规划问题，<br/>
	 * 假设dp[i]是截止到nums[i]为止能抢到的最多的钱，那么它要么是抢nums[i],要么不抢。<br/>
	 * 如果抢，那就是dp[i-2]+nums[i],如果不抢，那就是dp[i-1],二者取最大值。<br/>
	 * 观察到dp[i]只和前两个状态有关，所以空间上可以优化为常数。<br/>
	 * 
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		calltimes++;
		System.out.println("第" + calltimes + "次调用rob函数！！！");

		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		if (nums.length == 1) {
			return nums[0];
		}
//		System.out.println("nums.length:" + nums.length);
		int[] v_i_2 = Arrays.copyOfRange(nums, 0, nums.length - 2);
		int[] v_i_1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
//		System.out.println("v_i_2:" + Arrays.toString(v_i_2));
//		System.out.println("v_i_1:" + Arrays.toString(v_i_1));
//		System.out.println("nums[nums.lenth-1]:" + nums[nums.length - 1]);
		return Math.max(rob(v_i_2) + nums[nums.length - 1], rob(v_i_1));

	}

	public int robNew(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int dp1 = nums[0];
		int dp2 = Math.max(dp1, nums[1]);
		int dp = dp2;
		for (int i = 2; i < nums.length; i++) {
			dp = Math.max(dp1 + nums[i], dp2);
			dp1 = dp2;
			dp2 = dp;
		}
		return dp;
	}

	public static int[] result;

	public int rob3(int[] nums) {
		result = new int[nums.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int n = solve(nums.length-1, nums);

		return n;
	}

	private int solve(int index, int[] nums) {
		if (index < 0) {
			return 0;
		}
		if (result[index] >= 0) {
			return result[index];
		}
		result[index] = Math.max(solve(index - 1, nums), solve(index - 2, nums) + nums[index]);
		return result[index];
	}
}
