/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no1541;

class Solution {
    public int minInsertions(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        int len = s.length();
        int left = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == '(') {
                left++;
            } else {
                if (left == 0) res++;
                else left--;
                if (i == len - 1 || chars[i + 1] != ')') res++;
                else i++;
            }
        }
        return res + left * 2;
    }
}