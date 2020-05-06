/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No941_有效的山脉数组;

class Solution {


    public static void main(String[] args) {
        int[] A = {1, 3, 2};
        System.out.println(validMountainArray(A));
    }

    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        int k = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] >= A[i]) {
                k = i;
                break;
            }
        }
        System.out.println("k = " + k);
        if (k == 1 || k == 0) return false;
        for (int i = k; i < A.length; i++) {
            if (A[i - 1] <= A[i]) return false;
        }
        return true;
    }
}
