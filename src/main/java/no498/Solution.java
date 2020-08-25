/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no498;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution solution = new Solution();
        int[] ans = solution.findDiagonalOrder(matrix);
        System.out.println(Arrays.toString(ans));
    }

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[]{};
        int i = 0;
        int j = 0;
        boolean canReverse = false;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            list.add(matrix[i][j]);
            if (i == matrix.length - 1 && j == matrix[0].length - 1) break;
            if (canReverse) {
                i--;
                j++;
                if (j == matrix[0].length) {
                    j = matrix[0].length - 1;
                    i += 2;
                    canReverse = false;
                }
                if (i < 0) {
                    i = 0;
                    canReverse = !canReverse;
                }
            } else {
                i++;
                j--;
                if (i == matrix.length) {
                    i = matrix.length - 1;
                    j += 2;
                    canReverse = true;
                }
                if (j < 0) {
                    j = 0;
                    canReverse = !canReverse;
                }
            }

        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
