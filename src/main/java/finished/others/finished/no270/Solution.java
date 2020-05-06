/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no270;

class Solution {
    public int res = Integer.MAX_VALUE;
    public double init = Integer.MAX_VALUE;

    public int closestValue(TreeNode root, double target) {
        dfs(root, target);
        return res;
    }

    private void dfs(TreeNode root, double target) {
        if (root == null) return;
        int val = root.val;
        double dif = Math.abs(target - val);
        if (init > dif) {
            init = dif;
            res = val;
        }
        dfs(root.left, target);
        dfs(root.right, target);
    }
}