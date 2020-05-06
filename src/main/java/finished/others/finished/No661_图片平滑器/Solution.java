/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No661_图片平滑器;

public class Solution {
    public int[][] imageSmoother(int[][] M) {
        //遍历一遍就可以了
        //记录分母
        int[][] result = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int denominator = 0;
                int sum = 0;
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum += M[i - 1][j - 1];
                    denominator++;
                }
                if (i - 1 >= 0 && j >= 0) {
                    sum += M[i - 1][j];
                    denominator++;
                }
                if (i - 1 >= 0 && j + 1 <= M[0].length - 1) {
                    sum += M[i - 1][j + 1];
                    denominator++;
                }
                if (i >= 0 && j - 1 >= 0) {
                    sum += M[i][j - 1];
                    denominator++;
                }
                if (i >= 0 && j >= 0) {
                    sum += M[i][j];
                    denominator++;
                }
                if (i >= 0 && j + 1 <= M[0].length - 1) {
                    sum += M[i][j + 1];
                    denominator++;
                }
                if (i + 1 <= M.length - 1 && j - 1 >= 0) {
                    sum += M[i + 1][j - 1];
                    denominator++;
                }
                if (i + 1 <= M.length - 1 && j >= 0) {
                    sum += M[i + 1][j];
                    denominator++;
                }
                if (i + 1 <= M.length - 1 && j + 1 <= M[0].length - 1) {
                    sum += M[i + 1][j + 1];
                    denominator++;
                }
                result[i][j] = sum / denominator;
            }
        }
        return result;
    }
}
