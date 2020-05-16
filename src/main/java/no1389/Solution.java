/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1389;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int m = nums.length;
        int n = index.length;
        int i = 0;
        int j = 0;
        while (true) {
            if (i >= m && j >= n) {
                break;
            } else if (i < m && j < n) {
                list.add(index[j], nums[i]);
                i++;
                j++;
            }
        }
        Integer[] array = list.toArray(new Integer[0]);
        int[] res = new int[array.length];
        for (int k = 0; k < res.length; k++) {
            res[k] = array[k];
        }
        return res;
    }
}