/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no1065;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int[][] indexPairs(String text, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : words) {
            int index = 0;
            while (true) {
                int n = text.indexOf(s, index);
                if (n == -1) {
                    break;
                }
                String tmp = "" + n + "-" + (n + s.length() - 1);
                if (!list.contains(tmp)) list.add(tmp);
                index++;
            }
        }
        int size = list.size();
        int[][] res = new int[size][2];
        for (int i = 0; i < res.length; i++) {
            String[] tmp = list.get(i).split("-");
            res[i][0] = Integer.parseInt(tmp[0]);
            res[i][1] = Integer.parseInt(tmp[1]);
        }
        Arrays.sort(res, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        return res;
    }
}