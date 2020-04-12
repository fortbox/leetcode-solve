/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no250_统计同值子树;


class Solution {
    int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        /**
         * dfs 中序遍历.
         * 有一个暴利解法是用map记录父子结点的关系，然后暴利。
         */
        isAllEquals(root);
        return count;
    }

    private boolean isAllEquals(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) {
            count++;
            return true;
        }
        boolean isEquals = true;
        if (root.left != null) {
            isEquals = isAllEquals(root.left) && isEquals && root.val == root.left.val;
        }
        if (root.right != null) {
            isEquals = isAllEquals(root.right) && isEquals && root.val == root.right.val;
        }
        if (!isEquals) return false;
        if (isEquals) {
            count++;
        }
        return true;
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