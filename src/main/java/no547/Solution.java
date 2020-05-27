/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no547;

class Solution {
    public int findCircleNum(int[][] M) {
        /**
         * 标准的并查集
         */
        AndCheck edge = new AndCheck(M.length);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 1) edge.merge(i, j);
            }
        }
        return edge.count;
    }

    static class AndCheck {
        int[] parent;
        int[] weight;
        int size;
        int count;

        public AndCheck(int size) {
            this.size = size;
            parent = new int[size];
            weight = new int[size];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
                weight[i] = 1;
            }
            this.count = size;
        }

        /**
         * 1,find
         * 2,isConnected
         * 3,merge
         */
        public int find(int a) {
            int b = parent[a];
            if (b != a) return find(b);
            return b;
        }

        public boolean isConnected(int a, int b) {
            return find(a) == find(b);
        }

        public void merge(int a, int b) {
            int c = find(a);
            int d = find(b);
            if (c == d) return;
            parent[c] = d;
            weight[d] += weight[c];
            weight[c] = 0;
            count--;
        }
    }
}
