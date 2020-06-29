/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0401;

import java.util.HashSet;

class Solution {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        HashSet<Integer> set = new HashSet<>();
        set.add(start);
        int cycleTime = 0;
        while (cycleTime < 2) {
            for (int i = 0; i < graph.length; i++) {
                if (set.contains(graph[i][0])) {
                    set.add(graph[i][1]);
                }
            }
            cycleTime++;
        }
        return set.contains(target);
    }
}