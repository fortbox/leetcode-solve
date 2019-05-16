package N0101_对称二叉树;

public class Solution1 {
	/**
	 * 第二种解法，不用翻转，直接比较。 
	 * 但是采用第一种先翻转的话逻辑比较清晰
	 */
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);

	}

	public boolean isSymmetric(TreeNode p, TreeNode q) {
		if (p == null && q != null) {
			return false;
		} else if (p == null && q == null) {
			return true;
		} else if (p != null && q == null) {
			return false;
		} else {
			if (p.val == q.val) {
				boolean a = isSymmetric(p.left, q.right);
				boolean b = isSymmetric(p.right, q.left);
				if (a && b) {
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
