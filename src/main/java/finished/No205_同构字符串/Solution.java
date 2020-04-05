/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 * 
 */
package finished.No205_同构字符串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author henryxiao
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "abb";
		String t = "acc";
		boolean b = solution.isIsomorphic1(s, t);
//		boolean c=solution.isIsomorphic1(t, s);
//		boolean d=b&c;
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}

	public boolean isIsomorphic(String s, String t) {
		return isIsomorphic1(s, t) & isIsomorphic1(t, s);
	}

	/**
	 * 找到第一个字符串中有重复的字符，记录下来<br/>
	 * 然后对于有重复的字符在第二个字符串中替换测试。 1，有重复字符的应该记录下它的位置。
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isIsomorphic1(String s, String t) {
		Map<String, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		char[] sarray = s.toCharArray();
		char[] tarray = t.toCharArray();

		for (int i = 0; i < sarray.length; i++) {
			String temp = String.valueOf(sarray[i]);
			if (set.contains(temp)) {
				if (map.get(temp) == null) {
					int k = s.indexOf(sarray[i]);
					map.put(temp, k + "," + i);
				} else {
					String key = map.get(temp);
					key = key + "," + i;
					map.put(temp, key);
				}
			} else {
				set.add(temp);
				System.out.println(set.toString());
			}
		}

		if (map.size() == 0) {
			System.out.println("map.size==0");
			return true;
		}
		System.out.println("map.size==" + map.size());
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String s1 = entry.getKey();
			String s2 = entry.getValue();
			String[] s3 = s2.split(",");
			System.out.println(s2);
			int m1 = Integer.valueOf(s3[0]).intValue();
			char c = tarray[m1];
			for (int i = 0; i < s3.length; i++) {
				int mt = Integer.valueOf(s3[i]).intValue();
				tarray[mt] = c;
			}
		}
		String cmpString = new String(tarray);
		System.out.println("cmpString:" + cmpString);
		System.out.println("t:"+t);
		if (t.equals(cmpString)) {
			return true;
		}
		return false;
	}
}
