/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No303_区域和检索_数组不可变;

public class NumArray {

	private int[] nums;

	public NumArray(int[] nums) {
		nums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			this.nums[i] = nums[i];
		}
	}

	public int sumRange(int i, int j) {
		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum += nums[k];
		}
		return sum;
	}


}
