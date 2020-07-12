/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */
package finished.剑指offer.jz32_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return list.stream().mapToInt(value -> value).toArray();
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
