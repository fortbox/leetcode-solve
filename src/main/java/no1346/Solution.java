/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1346;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) set.add(i);
        for (int i : arr) {
            if (i != 0 && set.contains(2 * i)) {
                return true;
            }
            if (i == 0 && Arrays.stream(arr).filter(n -> n == 0).count() > 1) {
                return true;
            }
        }
        return false;
    }
}
