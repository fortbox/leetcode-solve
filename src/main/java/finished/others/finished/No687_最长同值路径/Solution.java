/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No687_最长同值路径;


class Solution {

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] a = new int[1];
        this.countmax(root, a);
        return a[0];

    }

    private int countmax(TreeNode root, int[] a) {
        int left = 0;
        if (root.left != null) {
            left += countmax(root.left, a);
            if (root.val == root.left.val) {
                left++;
            } else {
                left = 0;
            }
        }
        int right = 0;
        if (root.right != null) {
            right += countmax(root.right, a);
            if (root.val == root.right.val) {
                right++;
            } else {
                right = 0;
            }
        }
        int currentlen;
        if (root.left != null && root.right != null && root.left.val == root.right.val && root.left.val == root.val) {
            currentlen = left + right;
        } else {
            currentlen = Math.max(left, right);
        }
        a[0] = Math.max(a[0], currentlen);

        return Math.max(left, right);

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