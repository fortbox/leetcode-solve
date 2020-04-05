/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No101_对称二叉树;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/***
	 * 1，先把右边的树翻转一下。 2，比较左边的树和右边的树是否相等。 3，采用递归
	 * 
	 * @param root
	 * @return
	 */
	public static boolean isSymmetric(TreeNode root) {
		// 首先判断如果为空的情况
		if (root == null) {
			return true;
		}else{
			
			// 翻转右边的树
			// 新定义一个树，来记录
			root.right=reverseNode(root.right);
			// 比较两个链表是否相等。
			boolean b=cmpNode(root.left, root.right);
			return b;
		}

	}
	private static TreeNode reverseNode(TreeNode root) {
		if (root == null) {
			return root;
		}
		TreeNode temp=root.left;
		root.left=reverseNode(root.right);
		root.right=reverseNode(temp);
		return root;

	}

	private static boolean cmpNode(TreeNode t1, TreeNode t2) {
		if (t1 == null || t2 == null) {
			if (t1 == null && t2 == null) {
				return true;
			} else {
				return false;
			}
		} else {
			if (t1.val != t2.val) {
				return false;
			}
			boolean l = cmpNode(t1.left, t2.left);
			boolean r = cmpNode(t1.right, t2.right);
			if (l && r) {
				return true;
			} else {
				return false;
			}

		}
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
