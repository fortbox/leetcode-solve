/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No205_同构字符串;

import java.util.HashMap;
import java.util.HashSet;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		String s = "ab";
		String t = "aa";
		boolean b = solution.isIsomorphic(s, t);
		System.out.println(b);
	}

	/**
	 * 用hashmap 一一映射，（跟另外一个网友学习的思路） 假设s和t不为空，且长度相等
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isIsomorphic(String s, String t) {
		HashMap<String, String> hashMap = new HashMap<>();
		HashSet<Object> hashSet = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			String st = String.valueOf(s.charAt(i));
			String tt = String.valueOf(t.charAt(i));
			if (!hashMap.containsKey(st)) {
				if (hashSet.contains(tt)) {
					return false;
				}
				hashMap.put(st, tt);
				hashSet.add(tt);
			} else {
				String ttt = hashMap.get(st);
				if (!ttt.equals(tt)) {
					return false;
				}
			}

		}
		return true;
	}

}
