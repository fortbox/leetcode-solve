package No9_回文数;

public class Solution {
	public static void main(String[] args) {
		int x=12321;
		System.out.println(isPalindrome(x));

	}

	/**
	 * 1，转string 2，判断长度。奇数一种处理方法，偶数一种处理方法。 3，奇数左右扩散，偶数右+1扩散。
	 * 
	 */
	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int len = s.length();
		int mid = 0;
		boolean resultFlag = false;
		boolean oddOrEvenFlag = (len % 2 > 0) ? true : false;
		if (oddOrEvenFlag) {
			mid = (s.length() + 1) / 2 - 1;
			resultFlag = judgePalindrome(s, mid, mid);
		} else {
			mid = s.length() / 2 - 1;
			resultFlag = judgePalindrome(s, mid, mid + 1);
		}

		return resultFlag;
	}

	private static boolean judgePalindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		if (right == s.length()) {
			return true;
		} else {
			return false;
		}
	}

}
