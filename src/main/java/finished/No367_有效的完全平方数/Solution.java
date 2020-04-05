/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No367_有效的完全平方数;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();

		long startTime = System.currentTimeMillis();
		int num = 2147483647;
		System.out.println(solution.isPerfectSquare(num));
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间： " + (endTime - startTime) + "ms");

	}

	public boolean isPerfectSquare(int num) {
		if (num == 1) {
			return true;
		}
		long from = 1;
		while (from * from < num) {
			from++;
		}
		if (from * from == num) {
			return true;
		}
		return false;
	}

}
