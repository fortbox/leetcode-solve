/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1317;

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        int begin = 1;
        while (true) {
            res[0] = begin;
            res[1] = n - begin;
            if (!(String.valueOf(res[0]).contains("0") || String.valueOf(res[1]).contains("0"))) return res;
            begin++;
        }
    }
}
