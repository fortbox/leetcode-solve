/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No867_转置矩阵;

class Solution {
    public int[][] transpose(int[][] A) {
        int[][] a = new int[A[0].length][A.length];
        for (int j = 0; j < A[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
                a[j][i] = A[i][j];
            }
        }
        return a;
    }

}
