package No404_左叶子之和;

public class Solution {

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		if (root.left != null&&root.left.left==null&&root.left.right==null) {
			sum += root.left .val;
			System.out.println("left.val="+root.left.val);
		}
		int k = sumOfLeftLeaves(root.left);
		int m = sumOfLeftLeaves(root.right);
		sum = sum + k + m;
		return sum;
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
