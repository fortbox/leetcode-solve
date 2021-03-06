/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No226_翻转二叉树;

public class Solution {

	public TreeNode invertTree(TreeNode root) {
		TreeNode temp;
		if (root == null) {
			return null;
		}
		temp = invertTree(root.right);
		root.right = invertTree(root.left);
		root.left = temp;
		return root;
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
