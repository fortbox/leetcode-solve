/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No58_最后一个单词的长度;

public class Solution {

	public static void main(String[] args) {
		String s = "a ";
		System.out.println(lengthOfLastWord(s));

	}

	public static int lengthOfLastWord(String s) {
		s=s.trim();
		int k = s.lastIndexOf(' ');
		if (k == s.length() - 1) {
			return 0;
		} else if (k ==-1) {
			return s.length();
		}else {
			String subs = s.substring(k + 1);
			return subs.length();
		}

	}
}
