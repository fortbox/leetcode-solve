/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1356;

import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(array, (o1, o2) -> {
            String s1 = Integer.toBinaryString(o1);
            String s2 = Integer.toBinaryString(o2);
            int n1 = 0, n2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == '1') n1++;
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == '1') n2++;
            }
            if (n1 < n2) {
                return -1;
            } else if (n1 > n2) {
                return 1;
            } else {
                return o1 - o2;
            }
        });
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;

    }
}
