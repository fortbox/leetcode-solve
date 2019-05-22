package No409_最长回文串;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		String s = "abb";
		int n = solution.longestPalindrome(s);
		System.out.println("最长的回文字符串长度为：" + n);
	}

	/**
	 * 
	 * 最长回文字符串<br/>
	 * 思路：<br/>
	 * 1，转换成数组<br/>
	 * 2，排序<br/>
	 * 3，选出字母为偶数的个数<br/>
	 * 4，最长的长度等于偶数的个数+1<br/>
	 * 
	 * @param s
	 * @return
	 */
	public int longestPalindrome(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		// 1，转换成数组
		char[] ca = s.toCharArray();
		// 2，排序
		Arrays.parallelSort(ca);
		int n = 0;
		// 3，选出字母为偶数的个数
		for (int i = 0; i < ca.length - 1;) {
			if (ca[i] == ca[i + 1]) {
				n += 2;
				i += 2;
			} else {
				i++;
			}
		}
		System.out.println("字母为偶数的个数为：" + n);
		// 4，最长的长度等于偶数的个数，如果总长度大于你，要加一.
		if (s.length()>n) {
			n += 1;
		}
		return n;
	}
}
