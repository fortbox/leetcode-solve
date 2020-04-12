/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

 package tree.finished.no298_二叉树最长连续序列;

class Solution {
    public int longestConsecutive(TreeNode root) {
        /**
         * 想到了暴利解法，从每个顶点开始寻找最长的序列。
         * 用map来记录对应的关系
         * 用set来记录所有结点
         * 看了官方答案，其实只需要dfs的时候把父结点。相当于动态规划
         */
        return dfs(root, null, 0);
    }

    private int dfs(TreeNode node, TreeNode father, int len) {
        if (node == null) return len;
        if (father!=null&&node.val == father.val + 1) {
            len++;
        }else {
            len=1;
        }
        return Math.max(len, Math.max(dfs(node.left, node, len), dfs(node.right, node, len)));
    }
}
