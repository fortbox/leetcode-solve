/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int dif = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            if (tmp < dif) dif = tmp;
        }
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            if (tmp == dif) {
                list.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return list;
    }
}
