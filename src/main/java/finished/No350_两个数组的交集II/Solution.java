/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No350_两个数组的交集II;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] nums = solution.intersect(nums1, nums2);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

	public int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		if (nums1.length > nums2.length) {
			for (int i = 0; i < nums1.length; i++) {
				arrayList1.add(nums1[i]);
			}
			for (int i = 0; i < nums2.length; i++) {
				if (arrayList1.contains(nums2[i])) {
					arrayList2.add(nums2[i]);
					arrayList1.remove(Integer.valueOf(nums2[i]));
				}
			}
		} else {
			for (int i = 0; i < nums2.length; i++) {
				arrayList1.add(nums2[i]);
			}
			for (int i = 0; i < nums1.length; i++) {
				if (arrayList1.contains(nums1[i])) {
					arrayList2.add(nums1[i]);
					arrayList1.remove(Integer.valueOf(nums1[i]));
				}
			}
		}

		int[] nums = new int[arrayList2.size()];
		int i = 0;
		for (Integer integer : arrayList2) {
			nums[i++] = integer.intValue();
		}
		return nums;
	}

}
