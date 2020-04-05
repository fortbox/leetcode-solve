/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No452_用最少数量的箭引爆气球;

import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, ((o1, o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0])));
        int res = 1;
        if (points.length == 0) return 0;
        int start = points[0][0];
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] >= start) {
                start = points[i][0];
                if (points[i][1] < end) {
                    end = points[i][1];
                }
            }
            if (points[i][0] > end) {
                res++;
                start = points[i][0];
                end = points[i][1];
            }
        }
        return res;
    }
}