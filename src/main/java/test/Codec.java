/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished;

import java.util.List;


class Codec {

    // Encodes a tree to a single string.
    public String serialize(Node root) {
        if (root == null) return "";
        String s = "";
        s += root.val + ",";
        s += "[";
        for (Node node : root.children) {
            s += serialize(node);
        }
        if (s.charAt(s.length() - 1) == ',') {
            s = s.substring(0, s.length() - 1);
        }
        s += "]";
//        System.out.println("s = " + s);
        return s;
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        System.out.println("data = " + data);
        int index = 0;

        return null;
    }


    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
