/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1136;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int minimumSemesters(int N, int[][] relations) {
        EdgeNode[] nodes = new EdgeNode[N + 1];
        for (int i = 1; i < nodes.length; i++) {
            nodes[i] = new EdgeNode(i);
        }
        int[] admission = new int[N + 1];
        for (int[] relation : relations) {
            nodes[relation[0]].desList.add(relation[1]);
            admission[relation[1]]++;
        }
        Queue<EdgeNode> queue = new LinkedList<>();
        for (int i = 1; i < admission.length; i++) {
            if (admission[i] == 0) queue.add(nodes[i]);
        }
        int res = 0;
        int courseNum = 0;
        while (!queue.isEmpty()) {
            res++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                EdgeNode poll = queue.poll();
                courseNum++;
                for (int des : poll.desList) {
                    admission[des]--;
                    if (admission[des] == 0) queue.add(nodes[des]);
                }
            }
        }
        if (courseNum != N) return -1;
        return res;
    }

    class EdgeNode {
        int source;
        List<Integer> desList;

        public EdgeNode(int source) {
            this.source = source;
            desList = new ArrayList<>();
        }
    }
}