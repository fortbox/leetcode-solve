/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no1168;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        // 动态规划+并查集？一点思路也没有
        // 看了解题，虚拟0，然后kruskal's
        if (n <= 0) return n;
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        queue.addAll(Arrays.asList(pipes));
        for (int i = 0; i < n; i++) {
            queue.add(new int[]{0, i + 1, wells[i]});
        }
        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);
        int edgeNum = 0;
        int minCost = 0;
        while (edgeNum < n) {
            int[] edge = queue.poll();
            int a = findParent(parent, edge[0]);
            int b = findParent(parent, edge[1]);
            // 查看是否造成环
            if (a != b) {
                parent[a] = b;
                edgeNum++;
                minCost += edge[2];
            }
        }
        return minCost;
    }

    private int findParent(int[] parent, int k) {
        if (parent[k] == -1) {
            return k;
        }
        return findParent(parent, parent[k]);
    }
}