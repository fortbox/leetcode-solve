/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No501_二叉搜索树的众数;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
	/**
	 * 记录每个结点的次数 遍历二叉搜索树，然后用map 的key保存值，value保存次数。 然后对map遍历
	 * 这种方法没有利用到二叉搜索树的特点
	 */
	public int[] findMode(TreeNode root) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		this.getnode(root, map);
		int temp = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int m = entry.getKey();
			int n = entry.getValue();
			if (temp == n) {
				list.add(m);
			} else if (temp > n) {

			} else if (temp < n) {
				list.clear();
				list.add(m);
				temp = n;
			}
		}
		if (list.size() == 0) {
			return new int[0];
		}
		int[] nums = new int[list.size()];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = list.get(i);
		}
		return nums;
	}

	private void getnode(TreeNode root, HashMap<Integer, Integer> map) {
		if (root != null) {
			if (map.containsKey(root.val)) {
				int value = map.get(root.val);
				map.put(root.val, value + 1);
			} else {
				map.put(root.val, 1);
			}
			getnode(root.left, map);
			getnode(root.right, map);
		} else {
			return;
		}

	}

//  Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}