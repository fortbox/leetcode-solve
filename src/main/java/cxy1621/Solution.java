/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy1621;

import java.util.Arrays;

class Solution {
    public int[] findSwapValues(int[] array1, int[] array2) {
        int a = Arrays.stream(array1).sum();
        int b = Arrays.stream(array2).sum();
        Arrays.sort(array2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        long c = (long) a + b;
        if (c % 2 == 1) return new int[]{};
        int d = (a - b) / 2;
        System.out.println("d = " + d);
        for (int i = 0; i < array1.length; i++) {
            int m = array1[i] - d;
            int index = Arrays.binarySearch(array2, m);
            if (index > -1) {
                return new int[]{array1[i], array2[index]};
            }
        }
        return new int[]{};
    }

}
