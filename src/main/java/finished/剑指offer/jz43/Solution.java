/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz43;

class Solution {
    public static void main(String[] args) {
        int n = 12;
        int res = countDigitOne(n);
        System.out.println("res = " + res);
    }

    public static int countDigitOne(int n) {
        String s = String.valueOf(n);
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            int k = s.charAt(i) - '0';
            if (k == 1)
                dp[i] = k * dp[i - 1] + 1;
        }
        return dp[s.length() - 1];
    }
}
