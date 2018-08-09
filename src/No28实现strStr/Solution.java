package No28 µœ÷strStr;

public class Solution {

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issip";
		int index = strStr(haystack, needle);
		System.out.println(index);

	}

	public static int strStr(String haystack, String needle) {
		if (needle == null || "".equals(needle)) {
			return 0;
		}
		int lb = 0;
		while (lb < haystack.length()) {
			if (haystack.charAt(lb) == needle.charAt(0)) {
				int a = lb;
				int b = 0;
				while (a < haystack.length() && b < needle.length()) {
					if (haystack.charAt(a) == needle.charAt(b)) {
						a++;
						b++;
					} else {
						break;
					}
					if (b == needle.length()) {
						return lb;
					}

				}
			}
			lb++;
		}
		return -1;
	}
}
