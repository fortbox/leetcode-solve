/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1122_数组的相对排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr1) {
            Integer n = i;
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        int k = 0;
        for (int i : arr2) {
            Integer n = i;
            int m = map.get(n);
            for (int j = 0; j < m; j++) {
                arr1[k++] = n;
            }
            map.remove(n);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            while (value > 0) {
                list.add(key);
                value--;
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            arr1[k++] = i;
        }
        return arr1;
    }
}
