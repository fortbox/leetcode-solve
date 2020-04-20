/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no426;

class Solution {
    Node first = null;
    Node last = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        /**
         * 二叉搜索树的题，基本上都可以用中序遍历解决
         */
        inOrder(root);
        first.left = last;
        last.right = first;
        return first;
    }

    public void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        if (last != null) {
            last.right = node;
            node.left = last;
        } else {
            first = node;
        }
        last = node;
        inOrder(node.right);
    }
}
