package No112_路径总和;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/***
	 * 
	 * 问题：给定一个二叉树和一个目标和，判断该书中是否存在根节点到叶子节点的路径，
	 * 这条路径上所有节点值相加等于目标和。
	 * 思路：
	 * 1，从根节点开始遍历。
	 * 2，每次到根节点就判断下是否等于目标值
	 * 3，如果相等则返回true，否则继续遍历，直到遍历完成。
	 * @param root
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		int k = 0;
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null) {
			return root.val == sum;
		}
		k = sum - root.val;
		boolean bl = false;
		boolean br = false;
		if (root.left != null) {
			bl = hasPathSum(root.left, k);
		}
		if (root.right != null) {
			br = hasPathSum(root.right, k);
		}
		return bl || br;
	}
}
