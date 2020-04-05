/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No783_二叉搜索树结点最小距离;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int[] nodeRecord = new int[100];
    int k = 0;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < k; i++) {
            int temp = nodeRecord[i] - nodeRecord[i - 1];
            if (temp < result) result = temp;
        }
        return result;
    }

    //dfs use recursion,bfs use queue
    private void dfs(TreeNode node) {
        if (node == null) return;
        else {
            dfs(node.left);
            nodeRecord[k++] = node.val;
            dfs(node.right);
        }

    }


    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
