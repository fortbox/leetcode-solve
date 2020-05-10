/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1337;

import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] res = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int count = (int) Arrays.stream(mat[i]).filter(j -> j == 1).count();
            res[i][0] = count;
            res[i][1] = i;
        }
        Arrays.sort(res, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) answer[i] = res[i][1];
        return answer;
    }
}
