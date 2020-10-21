/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no51;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<String>> res = new ArrayList<>();
    int len;

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 14;
        long startTime = System.currentTimeMillis();
        List<List<String>> ans = solution.solveNQueens(n);
        long endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        System.out.println("ans.size() = " + ans.size());
//        System.out.println("ans = " + ans);
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] chess = new int[n][n];
        len = n;
        boolean[][] isUsed = new boolean[n][n];
        backTrack(chess, isUsed, 0, new ArrayList<>());
        return res;
    }

    private void backTrack(int[][] chess, boolean[][] isUsed, int index, List<String> path) {
        if (index == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            boolean isItAlreadyOccupied = false;
            for (int j = 0; j < len; j++) {
                if (isUsed[j][i]) {
                    isItAlreadyOccupied = true;
                    break;
                }
            }
            // 斜左向上
            // (index,i)
            int init_x = index - 1;
            int init_y = i - 1;
            if (!isItAlreadyOccupied) {
                while (init_x >= 0 && init_y >= 0) {
                    if (isUsed[init_x][init_y]) {
                        isItAlreadyOccupied = true;
                        break;
                    }
                    init_x--;
                    init_y--;
                }
            }

            // 斜right向下
            init_x = index + 1;
            init_y = i + 1;
            if (!isItAlreadyOccupied) {
                while (init_x < len && init_y < len) {
                    if (isUsed[init_x][init_y]) {
                        isItAlreadyOccupied = true;
                        break;
                    }
                    init_x++;
                    init_y++;
                }
            }
            // 斜右向上
            init_x = index - 1;
            init_y = i + 1;
            if (!isItAlreadyOccupied) {
                while (init_x >= 0 && init_y < len) {
                    if (isUsed[init_x][init_y]) {
                        isItAlreadyOccupied = true;
                        break;
                    }
                    init_x--;
                    init_y++;
                }
            }
            // 斜left向下
            init_x = index + 1;
            init_y = i - 1;
            if (!isItAlreadyOccupied) {
                while (init_x < len && init_y >= 0) {
                    if (isUsed[init_x][init_y]) {
                        isItAlreadyOccupied = true;
                        break;
                    }
                    init_x++;
                    init_y--;
                }
            }
            if (!isItAlreadyOccupied) {
                String temp = "";
                for (int j = 0; j < i; j++) {
                    temp += ".";
                }
                temp += "Q";
                for (int j = i + 1; j < len; j++) {
                    temp += ".";
                }
//                System.out.println("temp = " + temp);
                path.add(temp);
                isUsed[index][i] = true;
                backTrack(chess, isUsed, index + 1, path);
                path.remove(path.size() - 1);
                isUsed[index][i] = false;
            }
        }
    }
}