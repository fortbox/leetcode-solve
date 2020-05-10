/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1331;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        int index = 1;
        int[] ints = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(ints);
        for (int num : ints) {
            if (map.containsKey(num)) continue;
            map.put(num, index++);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
