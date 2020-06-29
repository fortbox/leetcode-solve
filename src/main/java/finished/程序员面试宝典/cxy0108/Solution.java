/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0108;

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] isVisited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && !isVisited[i][j]) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] != 0) {
                            isVisited[k][j] = true;
                            matrix[k][j] = 0;
                        }
                    }
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (matrix[i][k] != 0) {
                            isVisited[i][k] = true;
                            matrix[i][k] = 0;
                        }
                    }
                }
            }
        }
    }
}