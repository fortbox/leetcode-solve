/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0107;

import java.util.Arrays;

class Solution {
    public void rotate(int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;
        int[][] ints = new int[height][width];
        for (int i = 0; i < width; i++) {
            int index = 0;
            for (int j = width - 1; j >= 0; j--) {
                ints[i][index++] = matrix[j][i];
            }
            System.out.println("Arrays.toString(ints[i]) = " + Arrays.toString(ints[i]));
        }
        for (int i = 0; i < height; i++) {
            matrix[i] = Arrays.copyOf(ints[i], 0);
        }
    }
}