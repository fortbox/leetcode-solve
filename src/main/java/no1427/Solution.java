/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1427;

class Solution {
    public String stringShift(String s, int[][] shift) {
        int len = s.length();
        for (int[] array : shift) {
            int a = array[0];
            int b = array[1] % len;
            if (a == 0) {
                s = s.substring(b) + s.substring(0, b);
            } else {
                s = s.substring(len - b) + s.substring(0, len - b);
            }
        }
        return s;
    }
}
