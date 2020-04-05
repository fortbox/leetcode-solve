/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No324_4的幂;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPowerOfFour(int num) {
		int n=num;
		if (n <= 0) {
			return false;
		}
		if (n==1) {
			return true;
		}
		while (n >= 4) {
			if (n == 4) {
				return true;
			}
			if (n % 4 == 0) {
				n = n / 4;
			} else {
				return false;
			}
		}
		return false;
	}

}
