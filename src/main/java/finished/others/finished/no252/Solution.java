/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no252;

import java.util.Arrays;

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] a = intervals[i - 1];
            int[] b = intervals[i];
            if (a[1] > b[0]) return false;
        }
        return true;
    }
}