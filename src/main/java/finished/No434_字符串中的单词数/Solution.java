/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No434_字符串中的单词数;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = null;

		System.out.println(solution.countSegments(s));

	}

	public int countSegments(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				if (i < s.length() - 1) {
					if (s.charAt(i + 1) != ' ') {
						sum++;
					}
				}
			}
		}
		if (s.charAt(0) == ' ') {
			sum = sum - 1;
		}
		return sum + 1;

	}

}
