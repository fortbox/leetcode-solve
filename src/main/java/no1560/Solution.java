/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no1560;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < rounds.length; i++) {
            int a = rounds[i - 1];
            int b = rounds[i];
            if (i == 1) {
                list.add(a);
            }
            if (b > a) {
                for (int j = a + 1; j <= b; j++) {
                    list.add(j);
                }
            } else if (a == b) {
                continue;
            } else {
                for (int j = a + 1; j <= n; j++) {
                    list.add(j);
                }
                for (int j = 1; j <= b; j++) {
                    list.add(j);
                }
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        for (Integer integer : list) {
            map.put(integer, 1 + map.getOrDefault(integer, 0));
            if (map.get(integer) > maxValue) {
                maxValue = map.get(integer);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) res.add(entry.getKey());
        }
        res.sort(Integer::compareTo);
        return res;
    }
}
