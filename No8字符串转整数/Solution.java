/**
 * 
 */
package No8字符串转整数;

import java.math.BigDecimal;

public class Solution {
	private int a;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		String str = "+-a";
		int x = myAtoi(str);
		System.out.println(x);
	}
	public int m(String str) {
		return a;
	
	}

	
	
	public static int myAtoi(String str) {
		
		/**
		 * 用StringBuilder
		 * 
		 * @param str
		 * @return
		 */
		StringBuilder sb = new StringBuilder(str);
		if("".equals(str)){
			return 0;
		}
		while (sb.charAt(0) == ' ') {
			sb.deleteCharAt(0);
			if("".equals(sb.toString())){
				return 0;
			}
		}
		StringBuilder sb1 = new StringBuilder();
		int index = 0;
		if((sb.charAt(0) == '-' ||sb.charAt(0) == '+')){
			sb1.append(sb.charAt(0));
			index=1;
			while (index < sb.length() && (sb.charAt(index) == '0' || sb.charAt(index) == '1'
					|| sb.charAt(index) == '2' || sb.charAt(index) == '3' || sb.charAt(index) == '4'
					|| sb.charAt(index) == '5' || sb.charAt(index) == '6' || sb.charAt(index) == '7'
					|| sb.charAt(index) == '8' || sb.charAt(index) == '9')) {
			
				sb1.append(sb.charAt(index));
				index++;
			}
		}else{
			index=0;
			while (index < sb.length() && ( sb.charAt(index) == '0' || sb.charAt(index) == '1'
					|| sb.charAt(index) == '2' || sb.charAt(index) == '3' || sb.charAt(index) == '4'
					|| sb.charAt(index) == '5' || sb.charAt(index) == '6' || sb.charAt(index) == '7'
					|| sb.charAt(index) == '8' || sb.charAt(index) == '9')) {
				
				sb1.append(sb.charAt(index));
				index++;
			}
		}
		String s=sb1.toString();
		System.out.println(s);
		int x = 0;
		if ("".equals(s)||((s.charAt(0) == '-' || sb.charAt(0) == '+')&& s.length() == 1)){
			return 0;
		}else {
			if (s.charAt(0) == '-') {
				try {
					x = Integer.parseInt(s);
				} catch (Exception e) {
					return Integer.MIN_VALUE;
				}
			} else {
				try {
					x = Integer.parseInt(s);
				} catch (Exception e) {
					return Integer.MAX_VALUE;
				}
			}

		}
		return x;

	}
}
