/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No757_设置交集大小至少为2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> o1[1] == o2[1] ? o2[0] - o1[0] : o1[1] - o2[1]);

        list.add(intervals[0][1] - 1);
        list.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            int[] a = intervals[i];
            System.out.println("list:" + list.toString());
            System.out.println("a:" + Arrays.toString(a));

            if (a[0] <= list.get(list.size() - 2)) {
                continue;
            } else if (a[0] > list.get(list.size() - 1)) {
                list.add(a[1] - 1);
                list.add(a[1]);
            } else {
                list.add(a[1]);
            }
        }
        return list.size();
    }
}
