/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1394;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        map.forEach((k, v) -> {
            if (k.intValue() == v.intValue()) {
                list.add(k);
            }
        });
        list.sort(Integer::compareTo);
        return list.size() > 0 ? list.get(list.size() - 1) : -1;
    }
}