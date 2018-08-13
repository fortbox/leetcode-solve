package No104_二叉树的最大深度;

public class Solution {

	/**
	 * 递归左右，全局变量
	 * 
	 * @param root
	 * @return
	 */

	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
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
