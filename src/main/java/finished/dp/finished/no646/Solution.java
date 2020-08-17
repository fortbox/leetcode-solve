/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.dp.finished.no646;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int findLongestChain(int[][] pairs) {
        if (pairs.length == 0) return 0;
        Arrays.sort(pairs, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]));
        ArrayList<int[]> list = new ArrayList<>();
        list.add(pairs[0]);
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i - 1][0] != pairs[i][0]) {
                list.add(pairs[i]);
            }
        }
        int[][] array = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i][0] = list.get(i)[0];
            array[i][1] = list.get(i)[1];
        }
        int[] dp = new int[array.length];
        dp[0] = 1;
        for (int i = 1; i < array.length; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (array[i][0] > array[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[dp.length - 1];
    }
}
