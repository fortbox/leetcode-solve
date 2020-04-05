/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No682_棒球比赛;

import java.util.ArrayList;

class Solution {
    public int calPoints(String[] ops) {
        //用一个list记录，每次插入最前端
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            String c=ops[i];
           if ("C".equals(c)) {
                if (list.size() > 0) list.remove(0);
            } else if ("D".equals(c)) {
                if (list.size() > 0) {
                    int n = list.get(0);
                    list.add(0, n * 2);
                }
            } else if ("+".equals(c)) {
                int m = 0, n = 0;
                if (list.size() >= 1) {
                    m = list.get(0);
                }
                if (list.size() >= 2) {
                    n = list.get(1);
                }
                list.add(0, m + n);
            }else{
               int k=Integer.valueOf(c);

                   list.add(0, k);
           }
        }
        int result = 0;
        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }
}