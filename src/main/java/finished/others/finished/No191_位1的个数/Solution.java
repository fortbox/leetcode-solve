/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No191_位1的个数;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		String s = "01111111111111111111111111111101";
		int m = Integer.parseInt(s, 2);
		System.out.println(m);
		int k = solution.hammingWeight(m);
		System.out.println(k);
	}

	/**
	 * 思路： 1，定义m=1，while循环按位求余，并每次m向左移一位 2，循环31次。
	 *
	 * @param n
	 * @return
	 */
	public int hammingWeight(int n) {

		System.out.println(Integer.toBinaryString(n));
		int m = 1;
		int i = 31;
		int total = 0;
		if (n < 0) {
			total++;
		}
		while (i > 0) {
			if ((int) (n & m) > 0) {
				total++;
			}
//			System.out.println(total);
			m = m << 1;
//			System.out.println(m);
			i--;
		}
		return total;
	}
}
