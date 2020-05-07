/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1228;

class Solution {
    public int missingNumber(int[] arr) {
        int pre = 0;
        for (int i = 1; i < arr.length; i++) {
            int gap = arr[i] - arr[i - 1];
            if (gap == 2 * pre) return arr[i] - gap / 2;
            if (pre == 2 * gap) return arr[i - 1] - gap / 2;
            pre = gap;
        }
        return -1;
    }
}
