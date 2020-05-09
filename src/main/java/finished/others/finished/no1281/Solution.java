/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1281;

class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1, a = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            int t = c - '0';
            p *= t;
            a += t;
        }
        return p - a;
    }
}
