/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no1490;

import tool.Node;

class Solution {
    public Node cloneTree(Node root) {
        if (root == null) return null;
        Node newRoot = new Node(root.val);
        for (Node child : root.children) {
            Node node = cloneTree(child);
            newRoot.children.add(node);
        }
        return newRoot;
    }
}