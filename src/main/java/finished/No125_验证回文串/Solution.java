/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No125_验证回文串;

/**
 * 2018年8月17日 build
 * 
 * @author jrxiaoweixiang
 *
 */
public class Solution {

	public static void main(String[] args) {

		long startTime=System.currentTimeMillis();   //获取开始时间
		String s = "A man, a plan, a canal: Panama";
		Solution solution = new Solution();
		boolean flag = solution.isPalindrome1(s);
		System.out.println(flag);
		long endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
		
		char a='!';
		System.out.println(Character.toUpperCase(a));
	}

	/**
	 * 最简单的方法， 1，先把非字母去除 2，substring 3，字符串翻转 4，比较
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {

		StringBuilder sb = new StringBuilder(s);
		// 1，去除非字符
		for (int i = 0; i < sb.length();) {
			char c = sb.charAt(i);
			System.out.println(c);
			if (!Character.isLetterOrDigit(c)) {
				sb.deleteCharAt(i);
				continue;
			} else if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
				sb.setCharAt(i, c);
			}
			i++;
			System.out.println("sb.length=:"+sb.length());
		}
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		System.out.println(sb.toString());
		String s1;
		String s2;
		// 开始比较
		if (sb.length() % 2 == 0) {
			s1 = sb.substring(0, sb.length() / 2);
			s2 = sb.substring(sb.length() / 2);
		} else {
			s1 = sb.substring(0, sb.length() / 2);
			s2 = sb.substring(sb.length() / 2 + 1);
		}
		StringBuilder sb1 = new StringBuilder(s1);
		sb1 = sb1.reverse();
		if (sb1.toString().equals(s2)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 第二种方法，从两边取，只需遍历一遍
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPalindrome1(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		int left=0;
		int right=s.length()-1;
		char a,b;
		while(right>left){
			a=Character.toLowerCase(s.charAt(left));
			b=Character.toLowerCase(s.charAt(right));
			if (!Character.isLetterOrDigit(a)) {
				left++;
				continue;
			}
			if (!Character.isLetterOrDigit(b)) {
				right--;
				continue;
			}
			if (a!=b) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
