/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1266;

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int step = 0;
        for (int i = 1; i < points.length; i++) {
            int x = points[i][0] - points[i - 1][0];
            int y = points[i][1] - points[i - 1][1];
            System.out.println("x = " + x + ", y = " + y);
            step += Math.max(Math.abs(x), Math.abs(y));
        }
        return step;
    }
}
