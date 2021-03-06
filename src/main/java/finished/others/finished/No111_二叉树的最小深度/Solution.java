/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No111_二叉树的最小深度;

class Solution {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else if (root.left == null) {
			return 1 + minDepth(root.right);
		} else if (root.right == null) {
			return 1 + minDepth(root.left);
		} else {
			return 1 + Math.min(minDepth(root.left), minDepth(root.right));
		}
	}
}
