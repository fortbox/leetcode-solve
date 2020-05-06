/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No700_二叉搜索树中的搜索;


class Solution {
    //还是要利用二叉搜索树的性质啊
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) return root;
        TreeNode left = searchBST(root.left, val);
        if (left != null) return left;
        TreeNode right = searchBST(root.right, val);
        if (right != null) return right;
        return null;
    }


    //    Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}