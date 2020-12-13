/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no973;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < points.length; i++) {
            queue.add(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], points[i][0], points[i][1]});
        }
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            int[] poll = queue.poll();
            res[i][0] = poll[1];
            res[i][1] = poll[2];
        }
        return res;
    }
}