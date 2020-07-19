/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1430;

import tool.TreeNode;

import java.util.Arrays;

class Solution {
    boolean isRoot = true;

    public boolean isValidSequence(TreeNode root, int[] arr) {
        if (root == null) {
            return false;
        } else {
            if (arr.length == 0) return false;
            if (root.val != arr[0]) return false;
            if (root.left == null && root.right == null && arr.length == 1) return true;
            int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
            System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));
            boolean f1 = false, f2 = false;
            if (root.left != null) f1 = isValidSequence(root.left, newArr);
            if (root.right != null) f2 = isValidSequence(root.right, newArr);
            return f1 || f2;
        }
    }
}