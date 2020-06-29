/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0406;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {

    List<TreeNode> list = new ArrayList<>();

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root);
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(p, list.get(i))) {
                if (i == list.size() - 1) return null;
                return list.get(i + 1);
            }
        }
        System.out.println("不能到达这里");
        return null;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
}
