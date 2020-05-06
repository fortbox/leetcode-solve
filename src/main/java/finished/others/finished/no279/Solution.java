/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no279;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int numSquares(int n) {
        // 想不到bfs怎麼解決，還是dp更好理解一些
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public int bfs(int n) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited.add(0);
        int res = 0;
        while (!queue.isEmpty()) {
            res++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                for (int j = 1; cur + j * j <= n; j++) {
                    int num = cur + j * j;
                    if (num == n) {
                        return res;
                    }
                    if (visited.add(num)) {
                        queue.add(num);
                    }
                }
            }
        }
        return res;
    }


}
