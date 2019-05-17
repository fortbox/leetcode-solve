package No387_字符串中的第一个唯一字符;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		String s = "loveleetcode";
		int n = solution.firstUniqChar_1(s);
		System.out.println(n);

	}

	public int firstUniqChar(String s) {
		ArrayList<Character> arrayList = new ArrayList<>();
		for (Character character : s.toCharArray()) {
			arrayList.add(character);
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			arrayList.remove(Character.valueOf(c));
			if (!arrayList.contains(Character.valueOf(c))) {
				return i;
			}
		}
		return -1;
	}

	public int firstUniqChar_1(String s) {
		int[] a = new int[26];
		for (Character character : s.toCharArray()) {
			a[character - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (a[c - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
