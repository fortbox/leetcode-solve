/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.拓扑排序.no210;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int n = 2;
        int[][] a = {{1, 0}};
        Solution solution = new Solution();
        int[] order = solution.findOrder(n, a);
        System.out.println("order = " + Arrays.toString(order));
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        EdgeNode[] nodes = new EdgeNode[numCourses];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new EdgeNode(i);
        }
        // 入度的数组
        int[] admission = new int[numCourses];
        for (int[] p : prerequisites) {
            nodes[p[1]].desList.add(p[0]);
            admission[p[0]]++;
        }
        ArrayDeque<EdgeNode> deque = new ArrayDeque<>();
        for (int i = 0; i < admission.length; i++) {
            if (admission[i] == 0) deque.add(nodes[i]);
        }
        System.out.println("admission = " + Arrays.toString(admission));
        // 结果的数组
        int index = 0;
        int[] ans = new int[numCourses];
        while (!deque.isEmpty()) {
            int qSize = deque.size();
            System.out.println("qSize = " + qSize);
            for (int i = 0; i < qSize; i++) {
                EdgeNode poll = deque.poll();
                ans[index++] = poll.source;
                // 对相应的边的入度-1，然后判断入度是否为0，如果为0，则加入队列
                for (int n : poll.desList) {
                    admission[n]--;
                    if (admission[n] == 0) deque.add(nodes[n]);
                }
            }
        }
        System.out.println("index = " + index);
        System.out.println("numCourses = " + numCourses);
        // 如果有环的话，就代表一定存在入度一直不为0的数，这样会造成index<numCourses
        if (index != numCourses) return new int[]{};
        return ans;
    }

    public class EdgeNode {
        int source;
        List<Integer> desList;

        public EdgeNode(int source) {
            this.source = source;
            desList = new ArrayList<>();
        }
    }
}
