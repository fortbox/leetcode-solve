/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1304;

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            ans[index++] = i;
            ans[index++] = -1;
        }
        if (n % 2 == 1) ans[index] = 0;
        return ans;
    }
}
