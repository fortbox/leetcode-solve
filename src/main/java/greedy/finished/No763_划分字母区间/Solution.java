/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No763_划分字母区间;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "ababcbacadefegdehijhklij";
        List<Integer> list = solution.partitionLabels(S);
        System.out.println("list = " + list.toString());
    }

    public List<Integer> partitionLabels(String S) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (map.containsKey(c)) {
                List<Integer> list = map.get(c);
                list.add(i);
                map.put(c, list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c, list);
            }
        }
        int[][] ints = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            Collections.sort(list);
            if (list.size() >= 2) {
                ints[i][0] = list.get(0);
                ints[i][1] = list.get(list.size() - 1);
                i++;
            }
            if (list.size() == 1) {
                ints[i][0] = list.get(0);
                ints[i][1] = list.get(0);
                i++;
            }
        }
        Arrays.sort(ints, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        ArrayList<Integer> resList = new ArrayList<>();
        int begin = ints[0][0];
        int end = ints[0][1];
        for (int j = 1; j < ints.length; j++) {
            int[] a = ints[j];
            if (a[0] > end) {
                resList.add(end - begin - 1);
                begin = a[0];
                end = a[1];
            } else if (a[1] < end) {
                continue;
            } else if (a[1] > end) {
                end = a[1];
            }
        }
        resList.add(end - begin - 1);
        return resList;
    }
}
