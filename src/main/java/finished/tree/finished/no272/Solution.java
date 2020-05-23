/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no272;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    double t;
    int n;
    Queue<Integer> queue;

    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        // 用一个优先队列来保存值，然后遍历树，找到
        t = target;
        n = k;
        queue = new PriorityQueue<>((o1, o2) -> Double.compare(Math.abs(o2 - t), Math.abs(o1 - t)));
        inOrder(root);
        return new ArrayList<>(queue);
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        int val = root.val;
        if (queue.size() < n) {
            queue.add(val);
        } else {
            double t1 = Math.abs(val - t);
            Integer peek = queue.peek();
            double t2 = Math.abs(peek - t);
            if (t2 > t1) {
                queue.poll();
                queue.add(val);
            }
        }
        inOrder(root.right);
    }


    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
