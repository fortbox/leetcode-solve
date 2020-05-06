/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No118_杨辉三角;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.generate(5).toString());
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new LinkedList<>();
		int n = numRows;
		if (n == 0) {
			return list;
		} else if (n == 1) {
			Integer[] a = new Integer[]{1};
			List<Integer> newlist = Arrays.asList(a);
			list.add(newlist);
			return list;
		} else {
			list = generate(n - 1);
			List<Integer> newlist = list.get(list.size() - 1);
			Integer[] last = (Integer[]) newlist.toArray();
			Integer[] array = new Integer[n];
			array[0] = 1;
			array[n - 1] = 1;
			for (int i = 1; i < n - 1; i++) {
				array[i] = last[i - 1] + last[i];
			}
			newlist = Arrays.asList(array);
			list.add(newlist);
			return list;
		}
	}

}
