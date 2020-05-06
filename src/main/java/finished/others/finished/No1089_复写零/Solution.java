/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No1089_复写零;


import java.util.ArrayList;

class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
            if (i == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
