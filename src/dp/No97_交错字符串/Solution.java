/*
 * Copyright (c) 2019
 * @Author:xiaoweixiang
 */

package dp.No97_交错字符串;

public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        /**
         * s3的前k个字符由i个s1和k-i个s2组成.
         */

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length() + 1; i++) {
            for (int j = 0; j < s2.length() + 1; j++) {
                if (i == 0 && j > 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
                } else if (i > 0 && j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1);
                } else if (i == 0 && j == 0) {
                    dp[i][j] = false;
                } else {
                    dp[i][j] =
                            (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1 + j - 1)) || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 2));
                }
            }
        }
        return dp[s1.length()][s2.length()];


    }
}
