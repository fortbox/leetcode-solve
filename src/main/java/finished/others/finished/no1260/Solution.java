/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // 每次记住最后一列
        int row = grid.length;
        int col = grid[0].length;
        while (k > 0) {
            int[] lastCol = new int[row];
            for (int i = 0; i < row; i++) {
                lastCol[i] = grid[i][col - 1];
            }
            for (int i = 0; i < row; i++) {
                for (int j = col - 1; j > 0; j--) {
                    grid[i][j] = grid[i][j - 1];
                }
            }
            for (int i = 1; i < row; i++) {
                grid[i][0] = lastCol[i - 1];
            }
            grid[0][0] = lastCol[row - 1];
            k--;
        }
        List<List<Integer>> list = new ArrayList<>();
        Arrays.stream(grid).forEach(ints -> list.add(Arrays.stream(ints).boxed().collect(Collectors.toList())));
        return list;
    }
}
