/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1009;

import java.util.Arrays;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int i = Arrays.binarySearch(ints, target);
            if (i >= 0) return true;
        }
        return false;
    }
}