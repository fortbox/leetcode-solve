/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No671_二叉树中第二小的节点;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        //遍历树，然后记录，set，然后排序，遍历set找到第二个大的数
        HashSet<Integer> set = new HashSet<>();
        this.findnode(root, set);
        int[] a = new int[set.size()];
        if (a.length < 2) return -1;
        int i = 0;
        for (Integer integer : set) {
            a[i++] = integer.intValue();
        }
        Arrays.parallelSort(a);
        return a[1];
    }

    private void findnode(TreeNode root, Set set) {
        if (root == null) return;
        set.add(root.val);
        findnode(root.left, set);
        findnode(root.right, set);
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}