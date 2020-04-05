/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No589_N叉树的前序遍历;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.add(root.val);
        for (Node node : root.children) {
            list.addAll(preorder(node));
        }
        return list;
    }

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

}
