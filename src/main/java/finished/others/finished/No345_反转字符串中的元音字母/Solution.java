/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No345_反转字符串中的元音字母;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		String s = "leetcode";

		System.out.println(solution.reverseVowels(s));
	}

	/**
	 * 元音字母 有：a，e，i，o，u五个<br/>
	 *
	 * @param s
	 * @return
	 */
	public String reverseVowels(String s) {
		String ss = "aeiou";
		char[] c = ss.toCharArray();
		HashSet<Character> hashSet = new HashSet<>();
		for (int i = 0; i < c.length; i++) {
			hashSet.add(c[i]);
		}
		char[] cc = s.toCharArray();
		int i = 0;
		int j = cc.length - 1;
		while (i < j) {
			if (hashSet.contains(cc[i]) && hashSet.contains(cc[j])) {
				char ch = cc[i];
				cc[i] = cc[j];
				cc[j] = ch;
				i++;
				j--;
			} else if (hashSet.contains(cc[i]) && !hashSet.contains(cc[j])) {
				j--;
			} else if (!hashSet.contains(cc[i]) && hashSet.contains(cc[j])) {
				i++;
			} else if (!hashSet.contains(cc[i]) && !hashSet.contains(cc[j])) {
				i++;
				j--;
			}
		}
		return String.valueOf(cc);
	}

}
