/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no114;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        dfs(list,root);
        return list;

    }

    private void dfs(ArrayList<Integer> list, TreeNode root) {
        //前序，先遍历根节点，然后遍历左节点，然后遍历右节点
        if (root==null) return;
        list.add(root.val);
        dfs(list,root.left);
        dfs(list,root.right);
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}