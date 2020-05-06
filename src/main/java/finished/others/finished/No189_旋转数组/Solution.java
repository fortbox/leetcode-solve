/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No189_旋转数组;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {-1};
		int k = 2;
		Solution so = new Solution();
		so.rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}

	/**
	 * 字符串的翻转会比较麻烦，因为有负数
	 *
	 * @param nums
	 * @param k
	 */
	// 先实现第二种吧
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		int n = nums.length;
		inverseArray(nums, 0, n - k - 1);
		inverseArray(nums, n - k, n - 1);
		inverseArray(nums, 0, n - 1);

	}

	public void inverseArray(int[] nums, int start, int end) {
		while (end > start) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
