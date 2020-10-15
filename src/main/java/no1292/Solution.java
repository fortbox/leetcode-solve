/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1292;

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        // 二分法竟然可以这样用!
        int width = mat[0].length;
        int height = mat.length;
        int[][] area = new int[height + 1][width + 1];
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                area[i][j] = mat[i - 1][j - 1] + area[i - 1][j] + area[i][j - 1] - area[i - 1][j - 1];
            }
        }
        int res = 0;
        int low = 1, high = Math.min(height, width);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(mat, area, threshold, mid)) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    private boolean isValid(int[][] mat, int[][] area, int threshold, int k) {
        for (int i = k; i <= mat.length; i++) {
            for (int j = k; j <= mat[0].length; j++) {
                if (area[i][j] - area[i - k][j] - area[i][j - k] + area[i - k][j - k] <= threshold) {
                    return true;
                }
            }
        }
        return false;
    }
}