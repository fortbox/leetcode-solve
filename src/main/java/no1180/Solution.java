/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1180;

class Solution {
    public static int countLetters(String S) {
        int ans = 0, count = 1;
        for (int i = 1; i <= S.length(); i++) {
            if (i < S.length() && S.charAt(i - 1) == S.charAt(i)) count++;
            else {
                ans += (1 + count) * count / 2;
                count = 1;
            }
        }
        return ans;
    }
}
