package finished.No235_二叉搜索树的最近公共祖先;

class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			val = x;
		}
	}


	/**
	 * 思路：二叉搜索树的性质，左边小于node，右边大于node。<br/>
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root==null) {
			return null;
		}
		if (p.val==root.val) {
			return p;
		}
		if (q.val==root.val) {
			return q;
		}
		if (root.val>p.val&&root.val>q.val) {
			return lowestCommonAncestor(root.left, p, q);
		}
		if (root.val<p.val&&root.val<q.val) {
			return lowestCommonAncestor(root.right, p, q);
		}
		if ((root.val>p.val&&root.val<q.val)||(root.val<p.val&&root.val>q.val)) {
			return root;
		}
		return null;
	}
}
