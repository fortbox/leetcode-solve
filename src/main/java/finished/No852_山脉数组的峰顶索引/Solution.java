/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No852_山脉数组的峰顶索引;

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int maxi = 0;
        int maxnum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxnum) {
                maxi = i;
                maxnum=A[i];
            }
        }
        return maxi;
    }
}
