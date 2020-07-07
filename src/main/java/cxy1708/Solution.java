/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy1708;

import java.util.Arrays;

public class Solution {
    public int bestSeqAtIndex(int[] height, int[] weight) {
        int len = height.length;
        int[][] person = new int[len][2];
        for (int i = 0; i < len; i++) {
            person[i] = new int[]{height[i], weight[i]};
        }
        Arrays.sort(person, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        int[] dp = new int[len];
        int res = 0;
        for (int[] p : person) {
            int i = Arrays.binarySearch(dp, 0, res, p[1]);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = p[1];
            if (i == res) {
                res++;
            }
        }
        return res;
    }
}
