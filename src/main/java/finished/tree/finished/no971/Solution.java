/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no971;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<Integer> res = new ArrayList<Integer>();
    int index = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        return dfs(root, voyage) ? res : Arrays.asList(-1);
    }

    private boolean dfs(TreeNode root, int[] voyage) {
        if (root == null) return true;
        if (root.val != voyage[index]) return false;
        if (root.left != null && root.left.val != voyage[index + 1]) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            res.add(root.val);
        }
        index++;
        return dfs(root.left, voyage) && dfs(root.right, voyage);
    }

    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}