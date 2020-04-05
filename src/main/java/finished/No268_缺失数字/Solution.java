/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No268_缺失数字;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 首先排序，然后遍历
	 * 
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums) {
		if (nums.length == 1) {
			return nums[0] > 0 ? 0 : 1;
		}
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] > 1) {
				return nums[i] - 1;
			}
		}
		return nums[0] > 0 ? 0 : nums[nums.length - 1] + 1;
	}
	
	public int missingNumber_1(int[] nums) {
		int n1=0;
		int n2=0;
		for (int i = 0; i < nums.length; i++) {
			n1=n1+nums[i];
			n2=n2+i;
		}
		return n2+nums.length-n1;
	}

}
