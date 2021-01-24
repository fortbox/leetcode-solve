/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no5645;

class Solution {
    public int largestAltitude(int[] gain) {
        int maxValue = 0;
        for (int i = 0; i < gain.length; i++) {
            if (i != 0) {
                gain[i] += gain[i - 1];
            }
            maxValue = Math.max(gain[i], maxValue);
        }
        return maxValue;
    }
}