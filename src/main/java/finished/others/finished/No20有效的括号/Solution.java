/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No20有效的括号;

import java.util.Stack;

/**
 * ��Ч������
 *
 * @author henryxiao
 */
public class Solution {

	public static void main(String[] args) {
		String s = "((";
		System.out.println(isValid(s));

	}

	/***
	 * *
	 *
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		Stack<Character> sk = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if ('(' == s.charAt(i) || '[' == s.charAt(i) || '{' == s.charAt(i)) {

				sk.push(s.charAt(i));
			} else if (')' == s.charAt(i)) {
				if (sk.empty() || '(' != sk.peek()) {
					return false;
				} else {
					sk.pop();

				}
			} else if (']' == s.charAt(i)) {
				if (sk.empty() || '[' != sk.peek()) {
					return false;
				} else {
					sk.pop();

				}
			} else if ('}' == s.charAt(i)) {
				if (sk.empty() || '{' != sk.peek()) {
					return false;
				} else {
					sk.pop();

				}
			}

		}
		if (sk.empty()) return true;
		else {
			return false;
		}

	}
}
