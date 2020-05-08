/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1252;

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] array = new int[n][m];
        for (int[] arr : indices) {
            int row = arr[0];
            int col = arr[1];
            for (int i = 0; i < m; i++) {
                array[row][i]++;
            }
            for (int i = 0; i < n; i++) {
                array[i][col]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 == 1) ans++;
            }
        }
        return ans;
    }
}
