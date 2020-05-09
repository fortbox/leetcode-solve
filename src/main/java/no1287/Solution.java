/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1287;

import java.util.HashMap;

class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length / 4;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            Integer num = map.getOrDefault(i, 0);
            if (num > n) return i;
        }
        return -1;
    }
}