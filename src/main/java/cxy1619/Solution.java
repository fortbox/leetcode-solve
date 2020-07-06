/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy1619;

import java.util.ArrayList;

class Solution {
    boolean[][] isVisited;

    public int[] pondSizes(int[][] land) {
        isVisited = new boolean[land.length][land[0].length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 0 && !isVisited[i][j]) {
                    int ans = findPond(land, i, j);
                    list.add(ans);
                }
            }
        }
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    private int findPond(int[][] land, int i, int j) {
        int res = 1;
        isVisited[i][j] = true;
        if (i - 1 >= 0) {
            if (!isVisited[i - 1][j] && land[i - 1][j] == 0) {
                res += findPond(land, i - 1, j);
            }
        }
        if (i + 1 < land.length) {
            if (!isVisited[i + 1][j] && land[i + 1][j] == 0) {
                res += findPond(land, i + 1, j);
            }
        }
        if (j - 1 >= 0) {
            if (!isVisited[i][j - 1] && land[i][j - 1] == 0) {
                res += findPond(land, i, j - 1);
            }
        }
        if (j + 1 < land[0].length) {
            if (!isVisited[i][j + 1] && land[i][j + 1] == 0) {
                res += findPond(land, i, j + 1);
            }
        }
        if (i - 1 >= 0 && j - 1 >= 0) {
            if (!isVisited[i - 1][j - 1] && land[i - 1][j - 1] == 0) {
                res += findPond(land, i - 1, j - 1);
            }
        }
        if (i + 1 < land.length && j - 1 >= 0) {
            if (!isVisited[i + 1][j - 1] && land[i + 1][j - 1] == 0) {
                res += findPond(land, i + 1, j - 1);
            }
        }
        if (i - 1 >= 0 && j + 1 < land[0].length) {
            if (!isVisited[i - 1][j + 1] && land[i - 1][j + 1] == 0) {
                res += findPond(land, i - 1, j + 1);
            }
        }
        if (i + 1 < land.length && j + 1 < land[0].length) {
            if (!isVisited[i + 1][j + 1] && land[i + 1][j + 1] == 0) {
                res += findPond(land, i + 1, j + 1);
            }
        }
        return res;
    }
}