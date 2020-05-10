/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1342;

class Solution {
    public static int numberOfSteps(int num) {
        String s = Integer.toBinaryString(num);
        char[] chars = s.toCharArray();
        int n = 0;
        for (char c : chars) {
            if (c == '1') {
                n++;
            }
        }
        return s.length() - 1 + n;
    }
}
