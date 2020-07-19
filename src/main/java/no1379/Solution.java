/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1379;

import tool.TreeNode;

class Solution {
    private TreeNode res;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        dfs(cloned, target);
        return res;
    }

    private void dfs(TreeNode root, TreeNode target) {
        if (root == null) return;
        if (root.val == target.val) {
            res = root;
            return;
        }
        dfs(root.left, target);
        dfs(root.right, target);
    }
}
