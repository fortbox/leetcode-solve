package finished.No563_二叉树的坡度;


class Solution {
    /**
     * 相加左子树，相加右子树，然后取相减的绝对值
     *
     * @param root
     * @return
     */
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int m = this.add(root.left);
        int n = this.add(root.right);
        return Math.abs(m - n)+findTilt(root.left)+findTilt(root.right);
    }

    private int add(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + add(root.left) + add(root.right);
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
