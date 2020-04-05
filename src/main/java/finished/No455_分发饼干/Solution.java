/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 * 
 */
package finished.No455_分发饼干;

import java.util.Arrays;

/**
 * @author Henry Xiao
 * @date 2019年6月23日
 */
public class Solution {

	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] g= {1,2,3};
		int[] s= {1,1};
		int num=solution.findContentChildren(g, s);
		System.out.println(num);
	}
	/**
	 * 1，先对两个数组排序，这样的话，接下来只用循环一次
	 */
	public int findContentChildren(int[] g, int[] s) {
		Arrays.parallelSort(g);
		Arrays.parallelSort(s);
		int gl = g.length;
		int sl = s.length;
		int i = 0;
		int j = 0;
		int num = 0;
		while (i < gl && j < sl) {
			int gt = g[i];
			int st = s[j];
			if (gt <= st) {
				i++;
				j++;
				num++;
			} else {
				j++;
			}

		}
		return num;
	}
}
