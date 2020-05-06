/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No67_二进制求和;

public class Solution {

	public static void main(String[] args) {
		String a = "111";
		String b = "111";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		int ia = a.length() - 1;
		int ib = b.length() - 1;
		int cursor = 0;

		StringBuilder sb = new StringBuilder();
		while (ia >= 0 || ib >= 0) {
			if (ia >= 0 && ib >= 0) {
				char ca = a.charAt(ia);
				char cb = b.charAt(ib);
				System.out.println(ca);
				System.out.println(cb);
				int na = 0, nb = 0;
				if (ca == '1') {
					na = 1;
				} else {
					na = 0;
				}
				if (cb == '1') {
					nb = 1;
				} else {
					nb = 0;
				}
				int n = na + nb + cursor;
				if (n >= 2) {
					n = n - 2;
					cursor = 1;
				} else {
					cursor = 0;
				}
				sb.append(n);
				System.out.println("1:" + sb.toString());
			} else if (ia >= 0 && ib < 0) {
				char ca = a.charAt(ia);
				int na = 0;
				if (ca == '1') {
					na = 1;
				} else {
					na = 0;
				}
				int n = na + cursor;
				if (n >= 2) {
					n = n % 2;
					cursor = 1;
				} else {
					cursor = 0;
				}
				sb.append(n);
			} else if (ia < 0 && ib >= 0) {
				int nb = 0;
				char cb = b.charAt(ib);
				if (cb == '1') {
					nb = 1;
				} else {
					nb = 0;
				}
				int n = nb + cursor;
				if (n == 2) {
					n = 0;
					cursor = 1;
				} else {
					cursor = 0;
				}
				sb.append(n);
			}
			ia--;
			ib--;
		}

		String c = sb.reverse().toString();
		System.out.println("cursor=" + cursor);
		if (cursor == 1) {
			c = '1' + c;
		}
		return c;

	}
}
