package finished.No500_键盘行;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		String[] sa = solution.findWords(words);
		for (String string : sa) {
			System.out.println(string);
		}
	}

	/**
	 * 定义三张set，然后依次遍历
	 *
	 * @param words
	 * @return
	 */
	public String[] findWords(String[] words) {

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set3 = new HashSet<String>();
		String s1 = "QWERTYUIOPqwertyuiop";
		String s2 = "ASDFGHJKLasdfghjkl";
		String s3 = "ZXCVBNMzxcvbnm";
		for (int i = 0; i < s1.length(); i++) {
			set1.add(String.valueOf(s1.charAt(i)));
		}
		for (int i = 0; i < s2.length(); i++) {
			set2.add(String.valueOf(s2.charAt(i)));
		}
		for (int i = 0; i < s3.length(); i++) {
			set3.add(String.valueOf(s3.charAt(i)));
		}

		ArrayList<String> arrayList = new ArrayList<String>();
		for (String s : words) {
			for (int i = 0; i < s.length(); i++) {
				if (!set1.contains(String.valueOf(s.charAt(i)))) {
					break;
				}
				if (i == s.length() - 1) {
					arrayList.add(s);
				}
			}
			for (int i = 0; i < s.length(); i++) {
				if (!set2.contains(String.valueOf(s.charAt(i)))) {
					break;
				}
				if (i == s.length() - 1) {
					arrayList.add(s);
				}
			}
			for (int i = 0; i < s.length(); i++) {
				if (!set3.contains(String.valueOf(s.charAt(i)))) {
					break;
				}
				if (i == s.length() - 1) {
					arrayList.add(s);
				}
			}
		}
		String[] sa = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			String s = arrayList.get(i);
			sa[i] = s;
		}
		return sa;
	}
}
