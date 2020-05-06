/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No108_将有序数组转换成二叉搜索树;

public class Solution {
	public static void main(String[] args) {
		int[] a = {-10, -3, 0, 5, 9};
		Solution su = new Solution();
		TreeNode tn = new TreeNode(0);
		tn = su.sortedArrayToBST(a);
		System.out.println(tn.toString());
	}

	//	 1，找到中值则作为整棵树的跟节点
//	 2，然后在左子树找到中值作为左子树的根节点，然后递归 
//	 3，然后在右子树找到中值作为右子树的根节点，然后递归 
	public TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
		if (len == 0) {
			return null;
		}
//		System.out.println("len="+len);
		TreeNode tn = new TreeNode(0);
		tn.val = nums[len / 2];
		if (len < 2) {
			return tn;
		}
		int[] arrleft;
		int[] arrright;
		if (len % 2 == 0) {
			arrleft = new int[len / 2];
			arrright = new int[len / 2 - 1];
		} else {
			arrleft = new int[len / 2];
			arrright = new int[len / 2];
		}
		for (int i = 0; i < arrleft.length; i++) {
			arrleft[i] = nums[i];
		}
		for (int i = 0; i < arrright.length; i++) {
			arrright[i] = nums[i + len / 2 + 1];
		}
		tn.left = sortedArrayToBST(arrleft);
		tn.right = sortedArrayToBST(arrright);
		return tn;
	}


}
