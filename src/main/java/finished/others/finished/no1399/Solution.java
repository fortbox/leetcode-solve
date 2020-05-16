/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1399;

import java.util.*;

class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int m = sum(i);
            System.out.println("m = " + m);
            List<Integer> list = map.getOrDefault(m, new ArrayList<>());
            list.add(i);
            map.put(m, list);
        }

        ArrayList<Integer> list = new ArrayList<>();
        map.forEach((k, v) -> list.add(v.size()));
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int nn : list) {
            hashMap.put(nn, hashMap.getOrDefault(nn, 0) + 1);
        }
        int size = map.size();
        int[][] ans = new int[size][2];
        int index = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            ans[index][0] = entry.getKey();
            ans[index][1] = entry.getValue().size();
            index++;
        }
        Arrays.sort(ans, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o2[1] - o1[1]);
        for (int[] an : ans) {
            System.out.println("an[0] = " + an[0]);
            System.out.println("an[1] = " + an[1]);
        }
        int maxV = ans[0][1];
        int res = 1;
        for (int i = 1; i < ans.length; i++) {
            if (ans[i][1] == maxV) res++;
        }
        return res;
    }

    private int sum(int i) {
        int ans = 0;
        while (i > 0) {
            ans += i % 10;
            i /= 10;
        }
        return ans;
    }
}