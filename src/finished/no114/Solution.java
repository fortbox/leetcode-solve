/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package src.finished.no114;

import java.util.LinkedList;

public class Solution {

    LinkedList<Integer> list = new LinkedList<Integer>();

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode t = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = t;
    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
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
