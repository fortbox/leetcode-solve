/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No107_二叉树的层次遍历2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int num = queue.size();
			List<Integer> ll = new LinkedList<>();
			for (int i = 0; i < num; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				ll.add(queue.poll().val);
			}
			list.add(0, ll);
		}
		return list;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
