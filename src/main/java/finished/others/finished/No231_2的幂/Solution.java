/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No231_2的幂;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();

		int n = 16;
		boolean flag = solution.isPowerOfTwo(n);
		System.out.println("flag=" + flag);
	}

	/**
	 * 题目：判断一个数是不是2的幂数。<br/>
	 *
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo(int n) {
		if (n - 1 == 0) {
			return true;
		}
		if (n <= 0) {
			return false;
		}
		while (n >= 2) {
			System.out.println(n);
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}

}
