/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No892_三维形体的表面积;

class Solution {
    public static void main(String[] args) {
        int[][] grid = {{1, 0}, {0, 2}};
        int result = surfaceArea(grid);
        System.out.println("result = " + result);
    }

    public static int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int value = grid[i][j];
                sum += value > 0 ? value * 4 + 2 : 0;
                int left = i > 0 ? grid[i - 1][j] : 0;
                int down = j > 0 ? grid[i][j - 1] : 0;
                sum -= value > left ? left * 2 : value * 2;
                sum -= value > down ? down * 2 : value * 2;
            }
        }
        return sum;
    }
}
