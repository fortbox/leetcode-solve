/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no684;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int length = edges.length;
        UnionFind unionFind = new UnionFind(length + 1);
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (unionFind.isConnected(u, v)) {
                return edge;
            } else {
                unionFind.unionElements(u, v);
            }
        }
        return null;
    }

    public class UnionFind {
        int size;
        private int[] parent;
        private int[] height;

        public UnionFind(int size) {
            this.size = size;
            this.parent = new int[size];
            this.height = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                height[i] = 1;
            }
        }

        public int find(int element) {
            while (element != parent[element]) {
                element = parent[element];
            }
            return element;
        }

        public boolean isConnected(int firstElement, int secondElement) {
            return find(firstElement) == find(secondElement);
        }

        public void unionElements(int firstElement, int secondElement) {
            int firstRoot = find(firstElement);
            int secondRoot = find(secondElement);

            if (height[firstRoot] < height[secondRoot]) {
                parent[firstRoot] = secondRoot;
            } else if (height[firstRoot] > height[secondRoot]) {
                parent[secondRoot] = firstRoot;
            } else {
                parent[firstRoot] = secondRoot;
                height[secondRoot] += 1;
            }
        }
    }
}
