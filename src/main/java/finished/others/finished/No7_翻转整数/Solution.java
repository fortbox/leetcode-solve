/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No7_翻转整数;

public class Solution {

	public static void main(String[] args) {
		int a = -2147483648;
		a = reverse(a);
		System.out.println(a);


	}

	/**
	 * 1，判断正负数，如果负数则保存符号，并保留正数部分。
	 * 2，正数翻转就是while循环取余，然后除以10.或者转为字符串，然后字符串翻转。直接调用字符串翻转吧，直接有这个方法。
	 *
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {
		Boolean flag = false;
		long y = x;
		if (y < 0) {
			flag = true;
			y = -y;
		}
		String s = String.valueOf(y);
		s = new StringBuilder(s).reverse().toString();
		y = Long.parseLong(s);
		if (flag) {
			y = -y;
		}
		if (y < 0x80000000 || y > 0x7fffffff) {
			return 0;
		}
		return (int) y;
	}

}
