/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package dp.finished.No354_俄罗斯套娃信封问题;

import java.util.Arrays;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length <= 1) {
            return envelopes.length;
        }
        /**
         * 排序后,求最长子序列
         * dp[i]表示以i为结尾的最长子序列
         */
        Arrays.sort(envelopes, ((o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]));
        int[] dp = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        Arrays.sort(dp);
        return dp[envelopes.length - 1];
    }
}
