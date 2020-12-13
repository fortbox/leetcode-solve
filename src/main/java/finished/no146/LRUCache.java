/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no146;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    Map<Integer, Node> map = new HashMap<Integer, Node>();
    int capacity = 0;
    Node head = null;
    Node end = null;


    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.value;
        } else {
            return -1;
        }
    }

    private void setHead(Node node) {
        node.pre = null;
        node.next = head;
        if (head != null) head.pre = node;
        head = node;
        if (end == null) end = head;
    }

    private void remove(Node node) {
        if (node.pre == null) head = head.next;
        else node.pre.next = node.next;
        if (node.next == null) end = node.pre;
        else node.next.pre = node.pre;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            setHead(node);
        } else {
            Node newNode = new Node(key, value);
            if (this.capacity == map.size()) {
                map.remove(end.key);
                remove(end);
            }
            map.put(key, newNode);
            setHead(newNode);
        }
    }

    class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */