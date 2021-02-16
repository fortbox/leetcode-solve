/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package no743;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        Solution solution = new Solution();
        int res = solution.networkDelayTime(times, n, k);
        System.out.println("res = " + res);
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        // 构建graph
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE);
        }
        for (int[] time : times) {
            int a = time[0] - 1;
            int b = time[1] - 1;
            int c = time[2];
            graph[a][b] = c;
        }
        // dijstra 求出来最短路径
        DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath();
        int[] shortestPath = dijkstraShortestPath.shortestPath(graph, k - 1);
        System.out.println("Arrays.toString(shortestPath) = " + Arrays.toString(shortestPath));
        if (Arrays.stream(shortestPath).min().getAsInt() == -1) return -1;
        return Arrays.stream(shortestPath).max().getAsInt();
    }

    public class DijkstraShortestPath {
        public int[] shortestPath(int[][] graph, int start) {
            // 数组构建
            final int length = graph.length;
            int[] shortestPathArray = new int[length];
            Arrays.fill(shortestPathArray, -1);
            int[] visitedArray = new int[length];

            // 初始化
            // start==>start 路径长度为0
            shortestPathArray[start] = 0;
            // start 节点默认放在集合中
            visitedArray[start] = 1;

            // 开始循环处理剩下的节点
            for (int i = 1; i < length; i++) {
                // 距离 start 最近的点
                int k = -1;
                // 距离 start 最近的距离
                int disMin = Integer.MAX_VALUE;
                //1. 选取出距离顶点 start 最近的一个顶点
                for (int j = 0; j < length; j++) {
                    // 元素不在已访问的列表中且
                    if (visitedArray[j] == 0 && graph[start][j] < disMin) {
                        disMin = graph[start][j];
                        k = j;
                    }
                }
                System.out.println("k = " + k);
                if (k == -1) continue;
                // 更新信息,加入到最短的集合
                visitedArray[k] = 1;
                shortestPathArray[k] = disMin;
                // 更新距离表
                for (int index = 1; index < length; index++) {
                    //1. 不在最短列表中
                    //2. start==>shortestIndex+si==>index < start==>index，则进行距离表更新
                    if (visitedArray[index] == 0
                            && graph[start][k] != Integer.MAX_VALUE && graph[k][index] != Integer.MAX_VALUE && graph[start][k] + graph[k][index] < graph[start][index]) {
                        graph[start][index] = graph[start][k] + graph[k][index];
                    }
                }
            }
            return shortestPathArray;
        }
    }
}