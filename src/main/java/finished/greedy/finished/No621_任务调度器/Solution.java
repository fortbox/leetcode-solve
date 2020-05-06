/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No621_任务调度器;

import java.util.Arrays;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] dis = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            dis[tasks[i] - 'A']++;
        }
        Arrays.parallelSort(dis);
        int k = 0, j = 0;
        for (int i = dis.length - 1; i >= 0; i--) {
            if (dis[i] > 0) {
                k = dis[i];
                j = i;
                break;
            }
        }
        int res = (k - 1) * (n + 1) + 1;
        while (j >= 0) {
            if (dis[j] == k) {
                res++;
            }
            j--;
        }
        return Math.max(res, tasks.length);
    }
}
