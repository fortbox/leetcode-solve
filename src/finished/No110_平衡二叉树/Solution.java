package finished.No110_平衡二叉树;

public class Solution {

	public static void main(String[] args) {

	}

	public boolean isBalanced(TreeNode root) {
		// 1，找到左子树的深度
		// 2，找到右子树的深度
		// 2，比较左子树，右子树的深度只差，如果大于1，则返回false
		if (root == null) {
			return true;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		int leftDepth = findDepth(left);
		int rightDepth = findDepth(right);
		if (Math.abs(leftDepth - rightDepth) > 1) {
			return false;
		} else {
			return isBalanced(left)&&isBalanced(right);
		}

	}
	
	public int findDepth(TreeNode treeNode) {
		int height=0;
		if (treeNode==null) {
			return 0;
		}
		TreeNode left = treeNode.left;
		TreeNode right = treeNode.right;
		height=1+Math.max(findDepth(left), findDepth(right));
		return height;
	}
}
