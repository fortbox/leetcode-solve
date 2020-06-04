/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1469;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class Solution {
    public List<Integer> getLonelyNodes(TreeNode root) {
        /**
         * bfs
         */
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null && poll.right != null) {
                    queue.add(poll.left);
                    queue.add(poll.right);
                } else if (poll.left != null && poll.right == null) {
                    list.add(poll.left.val);
                    queue.add(poll.left);
                } else if (poll.left == null && poll.right != null) {
                    list.add(poll.right.val);
                    queue.add(poll.right);
                }
            }
        }
        return list;
    }


    //    Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}