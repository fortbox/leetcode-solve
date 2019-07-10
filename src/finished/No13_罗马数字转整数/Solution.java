package finished.No13_罗马数字转整数;

public class Solution {

	public static void main(String[] args) {
		String s="III";
		System.out.println(s);

	}

	/**
	 * 罗马数字转整数 思路： 1，遍历字符串，得到字符后如果为I，X，C，则还需要判断下一个字符， 2，如果为I，则要判断下一个字符是否是V或者X
	 * 3，如果是X，则要判断下一个字符是否是L或者C 4，如果是C，则要判断下一个字符是否是D或者M
	 * 
	 * @param s
	 * @return
	 */
	private static int romanToInt(String s) {
		int amount = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'M') {
				amount += 1000;
			}
			if (c == 'D') {
				amount += 500;
			}
			if (c == 'C') {
				if ((i + 1) < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
					amount -= 100;
				} else {
					amount += 100;
				}
			}
			if (c == 'L') {
				amount += 50;
			}
			if (c == 'X') {
				if ((i + 1) < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
					amount -= 10;
				} else {
					amount += 10;
				}
			}
			if (c == 'V') {
				amount += 5;
			}
			if (c == 'I') {
				if ((i + 1) < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
					amount -= 1;
				} else {
					amount += 1;
				}
			}
		}
		return amount;

	}
}
