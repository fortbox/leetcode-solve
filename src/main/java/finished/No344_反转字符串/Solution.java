/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No344_反转字符串;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}

}
