/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 *
 */
package finished.others.finished.No496_下一个更大元素I;

import java.util.ArrayList;

/**
 * @author Henry Xiao
 * @date 2019年6月30日
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 1，先找到对应位置 2，从对应位置开始遍历
	 */
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			int index = Integer.MAX_VALUE;
			for (int j = 0; j < nums2.length; j++) {
				if (nums2[j] == nums1[i]) {
					index = j;
				}
				if (j > index && nums2[j] > nums1[i]) {
					list.add(Integer.valueOf(nums2[j]));
					break;
				}
				if (j == nums2.length - 1) {
					list.add(Integer.valueOf(-1));
				}
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i).intValue();
		}
		return result;
	}

}
