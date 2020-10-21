/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1004;

public class Solution {
    public int longestOnes(int[] A, int K) {
        int left = 0;
        int ans = 0;
        int right = 0;
        int remain = 0;
        for (right = 0; right < A.length; right++) {
            if (A[right] == 0) {
                remain++;
                if (remain > K) {
                    while (A[left] != 0) {
                        left++;
                    }
                    left++;
                }
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
