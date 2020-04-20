/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no366;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findLeaves(TreeNode root) {
        /**
         * 暴利，每次去遍历根节点，直到为空。
         */
        List<List<Integer>> list = new ArrayList<>();

        while (root != null) {
            ArrayList<Integer> l = new ArrayList<>();
            boolean f = find(root, l);
            if (f) root = null;
            list.add(l);
        }
        return list;
    }

    private boolean find(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            System.out.println("root.val = " + root.val);
            list.add(root.val);
            return true;
        }
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                list.add(root.left.val);
                System.out.println("root.left.val = " + root.left.val);
                root.left = null;
            }
        }
        if (root.right != null) {
            if (root.right.left == null && root.right.right == null) {
                list.add(root.right.val);
                System.out.println("root.right.val = " + root.right.val);
                root.right = null;
            }
        }
        find(root.left, list);
        find(root.right, list);
        return false;
    }
}
