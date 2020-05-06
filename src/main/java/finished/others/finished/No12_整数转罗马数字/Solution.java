/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No12_整数转罗马数字;

public class Solution {
	public static void main(String[] args) {
		int a = 1994;
		System.out.println(intToRoman(a));

	}

	/**
	 * 思路： 1，把整数转为千，百，十，个。 2，对千百十个比较，组装成对应的字符串。 3，字符串拼装
	 *
	 * @param num
	 * @return
	 */

	public static String intToRoman(int num) {
		int iqian = num / 1000;
		num = num % 1000;
		int ibai = num / 100;
		num = num % 100;
		int ishi = num / 10;
		num = num % 10;
		int ige = num;
		String sqian = iqian + "";
		String sbai = ibai + "";
		String sshi = ishi + "";
		String sge = ige + "";
		String qian, bai, shi, ge;
		String rome;
		switch (sqian) {
			case "1":
				qian = "M";
				break;
			case "2":
				qian = "MM";
				break;
			case "3":
				qian = "MMM";
				break;
			default:
				qian = "";
				break;
		}

		switch (sbai) {
			case "1":
				bai = "C";
				break;
			case "2":
				bai = "CC";
				break;
			case "3":
				bai = "CCC";
				break;
			case "4":
				bai = "CD";
				break;
			case "5":
				bai = "D";
				break;
			case "6":
				bai = "DC";
				break;
			case "7":
				bai = "DCC";
				break;
			case "8":
				bai = "DCCC";
				break;
			case "9":
				bai = "CM";
				break;
			default:
				bai = "";
				break;
		}

		switch (sshi) {
			case "1":
				shi = "X";
				break;
			case "2":
				shi = "XX";
				break;
			case "3":
				shi = "XXX";
				break;
			case "4":
				shi = "XL";
				break;
			case "5":
				shi = "L";
				break;
			case "6":
				shi = "LX";
				break;
			case "7":
				shi = "LXX";
				break;
			case "8":
				shi = "LXXX";
				break;
			case "9":
				shi = "XC";
				break;
			default:
				shi = "";
				break;
		}
		switch (sge) {
			case "1":
				ge = "I";
				break;
			case "2":
				ge = "II";
				break;
			case "3":
				ge = "III";
				break;
			case "4":
				ge = "IV";
				break;
			case "5":
				ge = "V";
				break;
			case "6":
				ge = "VI";
				break;
			case "7":
				ge = "VII";
				break;
			case "8":
				ge = "VIII";
				break;
			case "9":
				ge = "IX";
				break;
			default:
				ge = "";
				break;
		}

		rome = qian + bai + shi + ge;
		return rome;
	}
}
