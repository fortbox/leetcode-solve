package No242_有效的字母异位词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		System.out.println(list.toString());
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] sc = s.toCharArray();
		Arrays.sort(sc);
		char[] tc = t.toCharArray();
		Arrays.sort(tc);
		int n = Math.min(sc.length, tc.length);
		for (int i = 0; i < n; i++) {
			if (sc[i] != tc[i]) {
				return false;
			}
		}
		return true;
	}
}
