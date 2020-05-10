/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1351;

import java.util.Arrays;

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) count += Arrays.stream(ints).filter(i -> i < 0).count();
        return count;
    }
}
