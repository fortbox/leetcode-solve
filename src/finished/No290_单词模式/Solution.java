package finished.No290_单词模式;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 1，先把str编程数组 2，遍历，并插入到hashmap里面
	 * 
	 * @param pattern
	 * @param str
	 * @return
	 */
	public boolean wordPattern(String pattern, String str) {
		String ss = " ";
		String[] sa = str.split(ss);
		for (String string : sa) {
			System.out.println("string:" + string);
		}
		if (pattern.length() != sa.length) {
			return false;
		}
		HashMap<String, String> hashMap = new HashMap<>();
		for (int i = 0; i < sa.length; i++) {
			String s1 = sa[i];
			String s2 = String.valueOf(pattern.charAt(i));
			if (hashMap.containsKey(s2)) {
				String s = hashMap.get(s2);
				if (!s1.equals(s)) {
					return false;
				}
			}
			if (!hashMap.containsKey(s2)) {
				if (hashMap.containsValue(s1)) {
					return false;
				}else {
				hashMap.put(s2, s1);
				}
			}
		}
		return true;
	}

}
