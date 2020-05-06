/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 *
 */
package finished.others.finished.No521_最长特殊序列I;

/**
 * @author Henry Xiao
 * @date 2019年7月7日
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findLUSlength(String a, String b) {
		int m = a.length();
		int n = b.length();
		if (a.equals(b)) {
			return -1;
		}
		return Math.max(m, n);
	}

}
