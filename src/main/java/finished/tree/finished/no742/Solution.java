/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no742;

public class Solution {
    int[] tok = new int[2000];
    int res = Integer.MAX_VALUE;
    int nodeVal = -1;

    public int findClosestLeaf(TreeNode root, int k) {
        dfs1(root, k);
        dfs2(root, tok[root.val], 0);
        return nodeVal;
    }

    private void dfs2(TreeNode node, int sameFatherTok, int fatherToThis) {
        if (node == null) return;
        if (tok[node.val] >= 0) {
            sameFatherTok = tok[node.val];
            fatherToThis = 0;
        }
        if (node.left == null && node.right == null) {
            if (res > sameFatherTok + fatherToThis) {
                res = sameFatherTok + fatherToThis;
                nodeVal = node.val;
            }
            return;
        }
        dfs2(node.left, sameFatherTok, fatherToThis + 1);
        dfs2(node.right, sameFatherTok, fatherToThis + 1);
    }

    private int dfs1(TreeNode root, int k) {
        if (root == null) return Integer.MIN_VALUE;
        tok[root.val] = Math.max(dfs1(root.left, k) + 1, dfs1(root.right, k) + 1);
        if (root.val == k) {
            tok[root.val] = 0;
            return 0;
        }
        return tok[root.val];
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }
}
