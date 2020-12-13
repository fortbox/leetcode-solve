/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no1672;

import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            res = Math.max(res, Arrays.stream(accounts[i]).sum());
        }
        return res;
    }
}