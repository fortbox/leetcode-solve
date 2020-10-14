/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no1057;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        // 计算每个人到每个自行车的曼哈顿距离
        // 得到一个距离list
        // 然后排序，得到结果
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (o1, o2) -> {
                    if (o1[0] != o2[0]) {
                        return o1[0] - o2[0];
                    } else {
                        return o1[1] == o2[1] ? o1[2] - o2[2] : o1[1] - o2[1];
                    }
                }
        );
        for (int i = 0; i < workers.length; i++) {
            for (int j = 0; j < bikes.length; j++) {
                queue.add(new int[]{
                        Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1]), i, j
                });
            }
        }
        int[] res = new int[workers.length];
        Arrays.fill(res, -1);
        //
        HashSet<Integer> bikeUsedSet = new HashSet<>();
        while (bikeUsedSet.size() < res.length) {
            int[] temp = queue.poll();
            if (res[temp[1]] == -1 && !bikeUsedSet.contains(temp[2])) {
                res[temp[1]] = temp[2];
                bikeUsedSet.add(temp[2]);
            }
        }
        return res;
    }
}