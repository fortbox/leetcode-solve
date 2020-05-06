/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no285_二叉搜索树中的顺序后继;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<Integer, TreeNode> map = new HashMap<>();
    List<Integer> list = new ArrayList<Integer>();

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        /**
         * 中序遍历，用一个map保存node
         */
        inOrderDfs(root);
        int size = list.size();
        Integer[] array = new Integer[size];
        list.toArray(array);

        int val = p.val;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                index = i + 1;
                break;
            }
        }
        if (index == array.length) return null;
        return map.get(array[index]);
    }

    private void inOrderDfs(TreeNode root) {
        if (root == null) return;
        inOrderDfs(root.left);
        list.add(root.val);
        map.put(root.val, root);
        inOrderDfs(root.right);

    }
}