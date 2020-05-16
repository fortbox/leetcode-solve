/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1380;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int c = matrix[i][j];
                if (check(matrix, i, j)) {
                    list.add(c);
                }
            }
        }
        return list;
    }

    private boolean check(int[][] matrix, int row, int column) {
        int n = matrix[row][column];
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[row][i] < n) return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] > n) return false;
        }
        return true;
    }
}
