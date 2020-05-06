/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1064;

class Solution {
    public int fixedPoint(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == i) return i;
        }
        return -1;
    }
}
