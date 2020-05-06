/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No100_相同的树;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 用递归来判断
	 *
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null || q == null) {
			if (p == null && q == null) {
				return true;
			} else {
				return false;
			}
		} else {
			if ((p.val == q.val)) {
				TreeNode pleft = p.left;
				TreeNode pright = p.right;
				TreeNode qleft = q.left;
				TreeNode qright = q.right;
				boolean leftflag = isSameTree(pleft, qleft);
				boolean rightflag = isSameTree(pright, qright);
				if (leftflag && rightflag) {
					return true;
				} else {
					return false;
				}
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
