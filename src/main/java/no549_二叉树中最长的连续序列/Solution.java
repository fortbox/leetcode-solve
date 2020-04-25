/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no549_二叉树中最长的连续序列;


class Solution {
    int maxLength = 0;

    public int longestConsecutive(TreeNode root) {
        /**
         * 参考官方
         * 二叉树的dp，外部来记录。防止重复。
         */
        longestPath(root);
        return maxLength;
    }

    private int[] longestPath(TreeNode root) {

        if (root == null) return new int[]{0, 0};
        int inr = 1, dcr = 1;
        if (root.left != null) {
            int[] l = longestPath(root.left);
            if (root.val == root.left.val - 1) dcr = l[1] + 1;// 官方这个地方标错了
            if (root.val == root.left.val + 1) inr = l[0] + 1;
        }
        if (root.right != null) {
            int[] r = longestPath(root.right);
            if (root.val == root.right.val - 1) dcr = Math.max(dcr, r[1] + 1);
            if (root.val == root.right.val + 1) inr = Math.max(inr, r[0] + 1);
        }
        maxLength = Math.max(maxLength, inr + dcr - 1);
        return new int[]{inr, dcr};
    }
}
