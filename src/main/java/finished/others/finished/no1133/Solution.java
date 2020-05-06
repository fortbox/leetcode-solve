/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1133;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int largestUniqueNumber(int[] A) {
        TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2) -> o2 - o1);
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) return key;
        }
        return -1;
    }
}
