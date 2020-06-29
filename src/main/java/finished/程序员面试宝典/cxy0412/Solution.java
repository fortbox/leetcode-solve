/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> list = new ArrayList<>();
    int ans = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        dfs(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return ans;
    }

    private void dfs(TreeNode root, int target) {
        if (root == null) return;
        if (target == root.val) ans++;
        dfs(root.left, target - root.val);
        dfs(root.right, target - root.val);
    }
}
