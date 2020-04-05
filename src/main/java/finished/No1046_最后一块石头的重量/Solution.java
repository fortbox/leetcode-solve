/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1046_最后一块石头的重量;

import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        Arrays.parallelSort(stones);
        for (int stone : stones) {
            list.add(0, stone);
        }
        while (list.size() > 1) {
            List<Integer> ll = new ArrayList<>(list);
            int m = ll.get(0);
            int n = ll.get(1);
            ll.remove(0);
            ll.remove(0);
            if (m != n) {
                ll.add(m - n);
            }
            Collections.sort(ll, Comparator.reverseOrder());
            list = ll;
        }
        return list.size() == 0 ? 0 : list.get(0);
    }
}
