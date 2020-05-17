/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1422;

class Solution {
    public int maxScore(String s) {
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < s.length(); i++) {
            String t1 = s.substring(0, i);
            String t2 = s.substring(i);
            int ans = sum(t1, t2);
            if (ans > res) res = ans;
        }
        return res;

    }

    private int sum(String t1, String t2) {
        int n = 0;
        for (char c : t1.toCharArray()) {
            if (c == '0') n++;
        }
        for (char c : t2.toCharArray()) {
            if (c == '1') n++;
        }
        return n;
    }
}
