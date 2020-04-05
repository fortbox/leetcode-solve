/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No938_二叉搜索树的范围和;


class Solution {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        this.dfs(root, L, R);
        return sum;
    }


    private void dfs(TreeNode root, int L, int R) {
        if (root == null) return;
        dfs(root.left, L, R);
        dfs(root.right, L, R);
        if (root.val >= L && root.val <= R) sum += root.val;
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
