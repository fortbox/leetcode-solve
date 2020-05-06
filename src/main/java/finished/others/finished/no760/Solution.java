/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no760;

import java.util.ArrayList;

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i : A) {
            listA.add(i);
        }
        for (int i : B) {
            listB.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer n : listA) {
            list.add(listB.indexOf(n));
        }
        int[] res = new int[A.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}