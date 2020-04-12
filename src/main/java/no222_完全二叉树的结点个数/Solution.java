/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no222_完全二叉树的结点个数;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int countNodes(TreeNode root) {
        /**
         * bfs
         *
         */
        int count=0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return count;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                count++;
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
        }
        return count;
    }
    //  Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
