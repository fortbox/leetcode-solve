/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package ToDo.No1013_将数组分成和相等的三个部分;

class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) return false;
        sum /= 3;
        int k = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            k += A[i];
            if (k == sum) {
                k = 0;
                count++;
            }

        }
        return count == 3;
    }
}
