/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1502;

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int[] diff = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            diff[i - 1] = arr[i] - arr[i - 1];
        }
        for (int i = 1; i < diff.length; i++) {
            if (diff[i] != diff[i - 1]) return false;
        }
        return true;
    }
}