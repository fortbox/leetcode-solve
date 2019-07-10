package finished.No415_字符串相加;

import java.math.BigDecimal;

public class Solution {

	public static void main(String[] args) {

		String num1 = "0";
		String num2 = "0";
		Solution solution = new Solution();
		String s = solution.addString(num1, num2);
		String s1 = solution.addString_1(num1, num2);
		System.out.println(s);
		System.out.println(s1);

	}

	/**
	 * 用bigdecimal
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String addString(String num1, String num2) {
		BigDecimal bigDecimal = new BigDecimal(num1);
		BigDecimal bigDecima2 = new BigDecimal(num2);
		BigDecimal bigDecima3 = bigDecima2.add(bigDecimal);
		return bigDecima3.toString();
	}

	/**
	 * 用每个字符相加
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String addString_1(String num1, String num2) {

		int i = num1.length() - 1;
		int j = num2.length() - 1;
		StringBuffer sb = new StringBuffer();
		int add = 0;

		while (i >= 0 || j >= 0 || add != 0) {
			char c1 = '0';
			char c2 = '0';
			if (i >= 0) {
				c1 = num1.charAt(i);
			}
			if (j >= 0) {
				c2 = num2.charAt(j);
			}
			int m = c1 - '0';
			int n = c2 - '0';
			int k = (m + n) % 10;
			sb.append(k + add);
			add = k / 10;
			i--;
			j--;
		}
		return sb.reverse().toString();
	}

}
