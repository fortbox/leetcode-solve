/*
 * Copyright (c) 2019
 * @Author:henry.xiao.cn@outlook.com
 */

package dp.No85_最大矩形;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    int area = findArea(i, j, matrix);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    private int findArea(int i, int j, char[][] matrix) {
        int h = findHigh(i, j, matrix);
        int w = findWidth(i, j, matrix, h);
        return h * w;
    }

    private int findWidth(int i, int j, char[][] matrix, int h) {
        int w = 0;
        for (int l = j; l >= 0; l--) {
            int k = i - h + 1;
            boolean f = true;
            while (k <= i) {
                if (matrix[k][l] != '1') {
                    f = false;
                    break;
                }
                k++;
            }
            if (!f) {
                break;
            }
            w++;
        }
        for (int l = j + 1; l < matrix[0].length; l++) {
            int k = i - h + 1;
            boolean f = true;
            while (k <= i) {
                if (matrix[k][l] != '1') {
                    f = false;
                    break;
                }
                k++;
            }
            if (!f) {
                break;
            }
            w++;
        }
        return w;
    }


    private int findHigh(int i, int j, char[][] matrix) {
        int k = i;
        int h = 0;
        while (k >= 0) {
            if (matrix[k][j] == '1') {
                h++;
            } else {
                break;
            }
            k--;
        }
        return h;
    }
}
