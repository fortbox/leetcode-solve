/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package jz46;

import java.util.Arrays;

class Solution {
    public static int translateNum(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= len; i++) {
            String s1 = s.substring(i - 2, i);
            System.out.println("s1 = " + s1);
            int a = Integer.parseInt(s1);
            if (a <= 25 && a >= 10) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));
        return dp[len];
    }

    public static void main(String[] args) {
        int num = 506;
        int res = translateNum(num);
        System.out.println("res = " + res);
    }
}
