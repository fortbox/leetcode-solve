/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package no1640;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        TreeMap<Integer, int[]> treeMap = new TreeMap<>(Integer::compareTo);
        for (int[] piece : pieces) {
            if (!map.containsKey(piece[0])) return false;
            treeMap.put(map.get(piece[0]), piece);
        }
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (Map.Entry<Integer, int[]> entry : treeMap.entrySet()) {
            for (int i : entry.getValue()) {
                if (index >= arr.length || arr[index] != i) return false;
                list.add(i);
                index++;
            }
        }
        return true;
    }
}