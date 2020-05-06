/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No766_托普利茨矩阵;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length - 1; i++) {
            if (!judge(matrix, 0, i)) {
                return false;
            }
        }
        for (int i = 0; i < matrix.length - 1; i++) {
            if (!judge(matrix, i, 0)) {
                return false;
            }
        }
        return true;
    }


    private boolean judge(int[][] matrix, int r, int c) {
        int k = matrix[r][c];
        for (int i = r + 1, j = c + 1; i < matrix.length && j < matrix[0].length; i++, j++) {
            if (k != matrix[i][j]) return false;
        }
        return true;
    }
}
