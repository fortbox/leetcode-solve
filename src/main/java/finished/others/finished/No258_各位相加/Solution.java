/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No258_各位相加;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int num = 38;
		System.out.println(solution.addDigits(num));
	}

	public int addDigits(int num) {
		if (num < 10) {
			return num;
		}
		String s = String.valueOf(num);
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			int k = Integer.valueOf(String.valueOf(s.charAt(i)));
			System.out.println(k);
			n = n + k;
			System.out.println("n=" + n);
		}
		return addDigits(n);
	}

}
