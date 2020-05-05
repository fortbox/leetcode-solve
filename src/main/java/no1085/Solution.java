/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1085;

import java.util.Arrays;

class Solution {
    public int sumOfDigits(int[] A) {
        Arrays.sort(A);
        int k = 0;
        while (A[0] > 0) {
            k = (k + A[0] % 10);
            A[0] = A[0] / 10;
        }
        return k % 2 == 1 ? 0 : 1;
    }
}
