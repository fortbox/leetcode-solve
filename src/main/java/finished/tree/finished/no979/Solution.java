/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no979;

class Solution {
    int ans = 0;

    public int distributeCoins(TreeNode root) {
        postOrder(root);
        return ans;
    }

    private int postOrder(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null) {
            root.val += postOrder(root.left) - 1;
        }
        if (root.right != null) {
            root.val += postOrder(root.right) - 1;
        }
        ans += Math.abs(root.val - 1);
        return root.val - 1;
    }


    //  Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
