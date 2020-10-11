/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no785;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] points = new int[graph.length];
        Arrays.fill(points, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < points.length; i++) {
            if (points[i] == -1) {
                stack.push(i);
                points[i] = 0;
                while (!stack.isEmpty()) {
                    Integer index = stack.pop();
                    for (int j = 0; j < graph[index].length; j++) {
                        if (points[graph[index][j]] == -1) {
                            points[graph[index][j]] = points[index] ^ 1;
                            stack.push(graph[index][j]);
                        } else {
                            if (points[index] == points[graph[index][j]]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}