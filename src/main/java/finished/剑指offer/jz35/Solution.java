/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz35;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node root = head;
        List<Node> newNodeList = new ArrayList<>();
        List<Node> oldNodeList = new ArrayList<>();
        Map<Node, Node> oldToNew = new HashMap<>();
        while (root != null) {
            Node tmp = new Node(root.val);
            newNodeList.add(tmp);
            oldNodeList.add(root);
            oldToNew.put(root, tmp);
            root = root.next;
        }
        for (int i = 0; i < newNodeList.size(); i++) {
            Node node0 = newNodeList.get(i);
            Node node1 = oldNodeList.get(i);
            Node newNext = oldToNew.get(node1.next);
            Node newRandom = oldToNew.get(node1.random);
            node0.next = newNext;
            node0.random = newRandom;
        }
        return newNodeList.get(0);
    }

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}