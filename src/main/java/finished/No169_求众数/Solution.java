/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No169_求众数;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { -1, 1, 1, 1, 2, 1 };
		System.out.println(majorityElement(nums));

	}

	/**
	 * 求众数，众数是指在数组中次数大于[n/2]的元素。 假设数组是非空的，并且给定的数组总是存在众数。 思路：排序，然后对数组元素进行一次遍历。判断。
	 * 
	 * @param nums
	 * @return
	 */
	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length / 2;
		int times = 1;
		int cursor = nums[0];
		for (int i = 1; i < nums.length; i++) {
			System.out.println(nums[i]);
			if (nums[i] != cursor) {
				cursor = nums[i];
				times = 1;
			} else {
				times++;
				System.out.println("times:" + times);
				if (times > n) {
					return cursor;
				}
			}
		}
		return cursor;
	}

}
