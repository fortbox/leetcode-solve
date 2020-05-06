/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 *
 */
package finished.others.finished.No520_检测大写字母;

/**
 * @author Henry Xiao
 * @date 2019年7月7日
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean detectCapitalUse(String word) {
		if (word.length() == 1) {
			return true;
		}
		char c = word.charAt(0);
		word = word.substring(1);
		if (c >= 'a' && c <= 'z') {
			return word.equals(word.toLowerCase());
		} else {
			return (word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()));
		}
	}
}
