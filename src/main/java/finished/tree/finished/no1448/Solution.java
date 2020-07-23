/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no1448;

import tool.TreeNode;

class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int maxValue) {
        if (root == null) return 0;
        if (root.val >= maxValue) {
            maxValue = root.val;
            return 1 + dfs(root.left, maxValue) + dfs(root.right, maxValue);
        } else {
            return dfs(root.left, maxValue) + dfs(root.right, maxValue);
        }
    }
}