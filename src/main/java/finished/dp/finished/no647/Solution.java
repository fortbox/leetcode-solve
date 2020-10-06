/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.dp.finished.no647;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        int ans = solution.countSubstrings(s);
        System.out.println("ans = " + ans);
    }

    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                        (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (dp[i][j]) res++;
            }
        }
        return res;
    }
}
