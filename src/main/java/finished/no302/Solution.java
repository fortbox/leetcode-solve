/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no302;

class Solution {
    public int minArea(char[][] image, int x, int y) {
        int m = image.length;
        int n = image[0].length;
        int left = searchMin(image, 0, y, true);
        int right = searchMax(image, y, n, true);
        int top = searchMin(image, 0, x, false);
        int bottom = searchMax(image, x, m, false);
        return (right - left + 1) * (bottom - top + 1);
    }

    private int searchMax(char[][] image, int start, int end, boolean isHorizontal) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (containOne(image, mid, isHorizontal)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end - 1;
    }

    private int searchMin(char[][] image, int start, int end, boolean isHorizontal) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!containOne(image, mid, isHorizontal)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    private boolean containOne(char[][] image, int mid, boolean isHorizontal) {
        if (isHorizontal) {
            for (int i = 0; i < image.length; i++) {
                if (image[i][mid] == '1') return true;
            }
        } else {
            for (int i = 0; i < image[0].length; i++) {
                if (image[mid][i] == '1') return true;
            }
        }
        return false;
    }

}