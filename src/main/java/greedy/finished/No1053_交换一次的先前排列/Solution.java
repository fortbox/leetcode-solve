/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No1053_交换一次的先前排列;

public class Solution {
    public int[] prevPermOpt1(int[] A) {
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                System.out.println("A[i] = " + A[i]);
                System.out.println("i = " + i);
                // must
                int k = -1;
                int cur = -1;
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] < A[i]) {
                        if (A[j] > cur) {
                            k = j;
                            cur = A[j];
                        }
                    }
                }
                int temp = A[i];
                A[i] = A[k];
                A[k] = temp;
                break;
            }
        }
        return A;
    }
}
