/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No530_二叉搜索树的最小绝对差;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /**
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        this.getAllNode(root, list);
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        Arrays.parallelSort(nums);
        int temp = nums[1] - nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int k = nums[i + 1] - nums[i];
            System.out.println("k = " + k);
            if (k < temp) {
                temp = k;
            }
        }
        return temp;
    }


    private void getAllNode(TreeNode root, List list) {
        if (root != null) {
            list.add(root.val);
            System.out.println("root.val = " + root.val);
        }
        if (root == null) return;
        getAllNode(root.left, list);
        getAllNode(root.right, list);
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
