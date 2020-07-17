/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz36;


class Solution {
    Node first = null;
    Node last = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        inOrder(root);
        first.left = last;
        last.right = first;
        return first;
    }

    private void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        if (last != null) {
            last.right = root;
            root.left = last;
        } else {
            first = root;
        }
        last = root;
        inOrder(root.right);
    }

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

}
