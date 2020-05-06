/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No832_翻转图像;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int[] a = A[i];
            int m = 0;
            int k = a.length - 1;
            while (m <= k) {
                int temp = a[m];
                a[m] = 1 - a[k];
                a[k] = 1 - temp;
                m++;
                k--;
            }
        }
        return A;
    }
}
