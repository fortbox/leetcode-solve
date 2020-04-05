/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 * 
 */
package finished.No504_七进制数;

/**
 * @author Henry Xiao
 * @date 2019年7月4日
 */
public class Solution {

	public static void main(String[] args) {

//		int num = 100;
		int num = -7;
		System.out.println(convertToBase7(num));
	}

	/**
	 * 1，先判断正负号，然后记录符号，转换成正数 2，遍历除以7，求余7，记录
	 * 
	 */
	public static String convertToBase7(int num) {
		StringBuilder sb = new StringBuilder();
		boolean f = true;
		if (num < 0) {
			sb.append("-");
			num = -num;
			f = false;
		}
		int base = 7;
		while (num > 0) {
			int m = num % base;
			num = num / base;
//			sb.append(String.valueOf(m));
			if (f) {
				sb.insert(0, m);
			} else {
				sb.insert(1, m);
			}
		}
		if (sb.length() == 0) {
			return "0";
		}
		return sb.toString();

	}

}
