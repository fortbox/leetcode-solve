/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no1245;

import java.util.*;

class Solution {
    private TreeVertex root = new TreeVertex(0);

    public int treeDiameter(int[][] edges) {
        if (edges.length == 0) return 0;
        Map<Integer, TreeVertex> treeVertexMap = initVertexCache();
        for (int i = 0; i < edges.length; i++) {
            TreeVertex vertex = getTreeVertex(treeVertexMap, edges[i][0]);
            TreeVertex childVertex = getTreeVertex(treeVertexMap, edges[i][1]);
            vertex.child.add(childVertex);
        }
        int[] maxDiameter = new int[]{0};
        getMaxDiameter(maxDiameter, root);
        return maxDiameter[0];
    }

    private Map<Integer, TreeVertex> initVertexCache() {
        HashMap<Integer, TreeVertex> treeVertexMap = new HashMap<>();
        treeVertexMap.put(0, root);
        return treeVertexMap;
    }

    private TreeVertex getTreeVertex(Map<Integer, TreeVertex> treeVertexMap, int index) {
        TreeVertex vertex = treeVertexMap.get(index);
        if (vertex == null) {
            vertex = new TreeVertex(index);
            treeVertexMap.put(index, vertex);
        }
        return vertex;
    }

    private int getMaxDiameter(int[] maxDiameter, TreeVertex vertex) {
        if (vertex == null) return 0;
        int curVertexDiameter = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(2);
        for (TreeVertex temp : vertex.child) {
            int tempDiameter = getMaxDiameter(maxDiameter, temp);
            curVertexDiameter = Math.max(curVertexDiameter, tempDiameter);
            if (pq.size() == 2) {
                if (tempDiameter > pq.peek()) {
                    pq.poll();
                    pq.offer(tempDiameter);
                }
            } else {
                pq.offer(tempDiameter);
            }
        }
        int sumDiameter = 0;
        while (!pq.isEmpty()) {
            sumDiameter += pq.poll();
        }
        maxDiameter[0] = Math.max(maxDiameter[0], sumDiameter);
        return 1 + curVertexDiameter;
    }

    private static class TreeVertex {
        int index;
        List<TreeVertex> child;

        TreeVertex(int index) {
            this.index = index;
            this.child = new ArrayList<>();
        }
    }
}