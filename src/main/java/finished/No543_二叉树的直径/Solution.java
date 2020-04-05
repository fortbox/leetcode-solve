/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No543_二叉树的直径;


class Solution {
    int maxDistance = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDepth(root);
        return maxDistance;
    }
    private int findDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findDepth(root.left);
        int right = findDepth(root.right);
        maxDistance=Math.max(maxDistance,left+right);
        return 1 + Math.max(left, right);
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