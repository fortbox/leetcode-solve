package No110_平衡二叉树;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBalanced(TreeNode root) {
		// 1，如果有左子树，没有右子树，则检查左子树有无子书，若有，则返回false；若无，则返回true；
		// 2，继续递归检查左右子树。
		if (root == null) {
			return true;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		int a=0,b=0;
		while(true) {
			
		}

//		if (left == null && right != null) {
//			if (right.left != null || right.right != null) {
//				return false;
//			}
//		}
//		if (left != null && right == null) {
//			if (left.left != null || left.right != null) {
//				return false;
//			}
//		}
//		if (left==null&&right==null) {
//			return true;
//		}
//		return isBalanced(left)&&isBalanced(right);
	}
}
