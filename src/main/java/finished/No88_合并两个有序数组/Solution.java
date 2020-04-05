/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No88_合并两个有序数组;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * nums1=numss1+nums2;对nums1排序
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
			nums1[m-1+i]=nums2[i];
		}
        Arrays.sort(nums1);
    }

}
