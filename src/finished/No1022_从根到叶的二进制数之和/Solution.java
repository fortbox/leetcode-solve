package finished.No1022_从根到叶的二进制数之和;


class Solution {

    public int sumRootToLeaf(TreeNode root) {
        return dfsChange(root, 0);
    }

    private int dfsChange(TreeNode root, int sum) {
        if (root == null) return 0;
        sum = (sum << 1) + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return dfsChange(root.left, sum) + dfsChange(root.right, sum);
    }

    //   Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
