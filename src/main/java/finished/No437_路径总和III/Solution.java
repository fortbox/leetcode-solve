/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 * 
 */
package finished.No437_路径总和III;

/**
 * created by henryxiao 2019年6月7日
 * 
 */
public class Solution {

	/**
	 * 思路：动态规划算法 每个结点向下遍历
	 * 
	 */
	public int pathSum(TreeNode root, int sum) {

		if (root==null) {
			return 0;
		}
		return pathSum(root.left,sum)+pathSum(root.right, sum)+findPath(root, sum);
	}
	public int findPath(TreeNode root, int sum) {
		int n = 0;
		if (root == null) {
			return 0;
		}
		if (root.val == sum) {
			System.out.println(root.val);
			n=n+1;
		} 
		return n+findPath(root.left,sum-root.val)+findPath(root.right,sum-root.val);
	}

	public void bianliTreeNode(TreeNode root) {

		if (root != null) {
			if (root.left != null) {
				bianliTreeNode(root.left);
			}
			if (root.right != null) {
				bianliTreeNode(root.right);
			}
		}

	}

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
