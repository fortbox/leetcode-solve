/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1426;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int countElements(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int res = 0;
        for (int i : arr) {
            if (list.contains(i + 1)) res++;
        }
        return res;
    }
}
