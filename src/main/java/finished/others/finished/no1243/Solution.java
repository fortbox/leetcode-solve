/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1243;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> transformArray(int[] arr) {
        // 1, 记住需要增长的，记住需要降低的
        // 2, 操作数组
        // 3,判断是否相等
        while (true) {
            ArrayList<Integer> addList = new ArrayList<>();
            ArrayList<Integer> minusList = new ArrayList<>();
            int[] tmp = Arrays.copyOfRange(arr, 0, arr.length);
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                    addList.add(i);
                }
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    minusList.add(i);
                }
            }
            for (Integer i : addList) {
                arr[i] += 1;
            }
            for (Integer i : minusList) {
                arr[i] -= 1;
            }
            if (Arrays.equals(tmp, arr)) {
                return Arrays.stream(arr).boxed().collect(Collectors.toList());
            }
        }
    }
}
