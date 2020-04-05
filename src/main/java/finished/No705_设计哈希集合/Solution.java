/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No705_设计哈希集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHashSet {

    private static List<LinkedList<Integer>> list;


    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        list = new ArrayList<LinkedList<Integer>>(16);
        for (int i = 0; i < 16; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        int m = key % 16;
        LinkedList<Integer> ll = list.get(m);
        if (!ll.contains(Integer.valueOf(key))){
            ll.add(key);
        }
    }

    public void remove(int key) {
        int m = key % 16;
        LinkedList<Integer> ll = list.get(m);
        ll.remove(Integer.valueOf(key));
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int m = key % 16;
        LinkedList<Integer> ll = list.get(m);
        return ll.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */