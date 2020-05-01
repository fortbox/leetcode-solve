/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no170;

import java.util.ArrayList;
import java.util.List;

class TwoSum {
    List<Integer> list;

    public TwoSum() {
        list = new ArrayList<>();
    }

    public void add(int number) {
        list.add(number);
    }

    public boolean find(int value) {
        list.sort(Integer::compareTo);
        int len = list.size() - 1;
        int index = 0;
        while (index < len) {
            int start = list.get(index);
            int end = list.get(len);
            if (start + end > value) {
                len--;
            } else if (start + end == value) {
                return true;
            } else {
                index++;
            }
        }
        return false;
    }
}
