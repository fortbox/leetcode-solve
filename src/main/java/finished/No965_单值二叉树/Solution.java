/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No965_单值二叉树;

import java.util.HashSet;

class Solution {
    private HashSet<Integer> set = new HashSet<>();

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        this.set.add(root.val);
        return this.set.size() == 1 && isUnivalTree(root.left) && isUnivalTree(root.right);
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
