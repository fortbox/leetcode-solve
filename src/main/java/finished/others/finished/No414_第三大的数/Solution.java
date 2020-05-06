/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No414_第三大的数;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[] nums = {2, 2, 3, 1};
		System.out.println(solution.thirdMax(nums));
	}

	/**
	 * 思路：存三个变量来代表前三位数。
	 *
	 * @param nums
	 * @return
	 */
	public int thirdMax(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			hashSet.add(nums[i]);
		}
		if (hashSet.size() < 3) {

			return findMax(nums);
		}

		// 2，如果长度大于3，则用一个数组来表示最大的三个数
		int[] ms = new int[3];
		for (int i = 0; i < ms.length; i++) {
			ms[i] = Integer.MIN_VALUE;
		}
		for (int i = 0; i < nums.length; i++) {
			if (eq(nums[i], ms)) {
				continue;
			}
			int k = findMinI(ms);
			if (nums[i] > ms[k]) {
				ms[k] = nums[i];
			}
		}
		return findMin(ms);
	}

	private int findMin(int[] nums) {

		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < temp) {
				temp = nums[i];
			}
		}
		return temp;
	}

	private int findMinI(int[] nums) {

		int k = 0;
		int temp = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < temp) {
				temp = nums[i];
				k = i;
			}
		}
		return k;
	}

	private boolean eq(int n, int[] ms) {
		for (int j = 0; j < ms.length; j++) {
			if (n == ms[j]) {
				return true;
			}
		}
		return false;
	}

	private int findMax(int[] nums) {
		int temp = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > temp) {
				temp = nums[i];
			}
		}
		return temp;
	}

}
