/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1443;

import java.util.List;

class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        // 一点思路也没有，
        // 参考了其他人的解题
        // 利用了题目默认条件
        int res = 0;
        for (int i = edges.length - 1; i >= 0; i--) if (hasApple.get(edges[i][1])) hasApple.set(edges[i][0], true);
        for (int[] edge : edges) if (hasApple.get(edge[1])) res += 2;
        return res;

    }
}
