/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1086;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] highFive(int[][] items) {
        Arrays.sort(items, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int[] item : items) {
            int a = item[0];
            int b = item[1];
            List<Integer> list = map.getOrDefault(a, new ArrayList<>());
            if (list.size() > 5) continue;
            list.add(b);
            map.put(a, list);
        }
        int[][] ans = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> list = entry.getValue();
            System.out.println("list.size() = " + list.size());
            Double average = list.stream().limit(5).collect(Collectors.averagingInt(Integer::intValue));
            ans[index][0] = key;
            ans[index][1] = average.intValue();
            index++;
        }
        return ans;
    }
}