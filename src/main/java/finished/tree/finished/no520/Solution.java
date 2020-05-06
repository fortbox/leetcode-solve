/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no520;

class Solution {
    public Node inorderSuccessor(Node node) {
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {
            Node tmp = node.parent;
            while (tmp.left != node) {
                node = tmp;
                tmp = node.parent;
            }
            return tmp;
        }
    }
}
