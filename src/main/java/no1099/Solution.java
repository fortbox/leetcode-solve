/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1099;

import java.util.Arrays;
import java.util.TreeSet;

class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int n = A[i] + A[j];
                if (n >= K) break;
                set.add(n);
            }
        }
        Integer ans = set.lower(K);
        return ans == null ? -1 : ans.intValue();
    }
}
