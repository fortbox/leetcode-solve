/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No637_二叉树的层平均值;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    /**
     * 用队列，先入先出，每次压入一层,用一个参数记录一层压入了多少个。
     *
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {

        ArrayList<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int n = 0;
        queue.add(root);
        n = 1;
        while (!queue.isEmpty()) {
            int k = n;
            int denominator = n;
            n = 0;
            double m = 0;
            while (k > 0) {
                k--;
                TreeNode node = queue.poll();
                m += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                    n++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    n++;
                }
            }
            list.add(m / denominator);
        }
        return list;
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
