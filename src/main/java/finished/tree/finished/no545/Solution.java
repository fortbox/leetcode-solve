/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no545;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        /**
         * 记录 太easy
         */
        List<Integer> list = new ArrayList<>();
        list.addAll(leftBorder(root));
        list.addAll(leaves(root));
        List<Integer> rightBorder = rightBorder(root);
        Collections.reverse(rightBorder);
        list.addAll(rightBorder);
        return list.stream().distinct().collect(Collectors.toList());
    }


    private List<Integer> rightBorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.val);
        if (root.right == null) return list;
        root = root.right;
        while (root != null) {
            if (root.left == null && root.right == null) break;
            list.add(root.val);
            System.out.println("root.val = " + root.val);
            if (root.right != null) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        list.forEach(System.out::println);
        return list;
    }

    private List<Integer> leaves(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        dfs(root, list);
        list.forEach(System.out::println);
        return list;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        dfs(root.left, list);
        dfs(root.right, list);
    }

    private List<Integer> leftBorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.val);
        if (root.left == null) return list;
        root = root.left;
        while (root != null) {
            list.add(root.val);
            if (root.left != null) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        list.forEach(System.out::println);
        return list;
    }
}
