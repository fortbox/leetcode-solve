/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no380;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomizedSet {
    List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        list = new ArrayList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (list.contains(val)) return false;
        list.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!list.contains(val)) return false;
        int index = list.indexOf(val);
        Integer integer = list.get(list.size() - 1);
        list.set(index, integer);
        list.remove(list.size() - 1);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int size = list.size();
        int ran = new Random().nextInt(size);
        return list.get(ran);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */