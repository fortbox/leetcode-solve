/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No896_单调数列;

class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increaseFlag = true;
        if (A[0] > A[A.length - 1]) {
            increaseFlag = false;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (increaseFlag) {
                if (A[i] > A[i + 1]) {
                    return false;
                }
            } else {
                if (A[i] < A[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
