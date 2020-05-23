/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no431;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 参考官方的bfs
 */
class Codec {
    // Encodes an n-ary tree to a binary tree.
    public TreeNode encode(Node root) {
        if (root == null) return null;
        TreeNode bRoot = new TreeNode(root.val);
        Pair<TreeNode, Node> pair = new Pair<>(bRoot, root);
        ArrayDeque<Pair<TreeNode, Node>> deque = new ArrayDeque<>();
        deque.add(pair);
        while (!deque.isEmpty()) {
            Pair<TreeNode, Node> poll = deque.poll();
            TreeNode bNode = poll.first;
            Node nNode = poll.second;
            TreeNode head = null, pre = null;
            for (Node child : nNode.children) {
                TreeNode treeNode = new TreeNode(child.val);
                if (pre == null) {
                    head = treeNode;
                } else {
                    pre.right = treeNode;
                }
                pre = treeNode;
                deque.add(new Pair<>(treeNode, child));
            }
            bNode.left = head;
        }
        return bRoot;
    }

    // Decodes your binary tree to an n-ary tree.
    public Node decode(TreeNode root) {
        if (root == null) return null;
        Node nNode = new Node(root.val, new ArrayList<>());
        ArrayDeque<Pair<Node, TreeNode>> deque = new ArrayDeque<>();
        deque.add(new Pair<>(nNode, root));
        while (!deque.isEmpty()) {
            Pair<Node, TreeNode> poll = deque.poll();
            Node first = poll.first;
            TreeNode second = poll.second.left;
            List<Node> children = first.children;
            while (second != null) {
                Node n = new Node(second.val, new ArrayList<>());
                children.add(n);
                deque.add(new Pair<>(n, second));
                second = second.right;
            }
        }
        return nNode;
    }

    public static class Pair<U, V> {
        U first;
        V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(root));
