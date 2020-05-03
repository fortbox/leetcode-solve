/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no624;

import java.util.List;

class Solution {
    private static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));

    }

    public int maxDistance(List<List<Integer>> arrays) {
        int size = arrays.size();
        int maxDis = 0;
        int pre_min = arrays.get(0).get(0);
        int pre_max = arrays.get(0).get(arrays.get(0).size() - 1);
        for (int i = 1; i < size; i++) {
            List<Integer> l1 = arrays.get(i);
            int cur_min = l1.get(0);
            int cur_max = l1.get(l1.size() - 1);
            maxDis = getMax(maxDis, Math.abs(cur_max - pre_min), Math.abs(pre_max - cur_min));
            pre_min = Math.min(pre_min, cur_min);
            pre_max = Math.max(pre_max, cur_max);
        }
        return maxDis;
    }

}