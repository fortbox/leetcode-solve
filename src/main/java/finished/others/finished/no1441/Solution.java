/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1441;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String PUSH = "Push";
    private static final String POP = "Pop";

    public List<String> buildArray(int[] target, int n) {
        int m = 1;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < target.length; i++) {
            int k = target[i];
            while (true) {
                if (k == m) {
                    m++;
                    list.add(PUSH);
                    break;
                } else {
                    m++;
                    list.add(PUSH);
                    list.add(POP);
                }
            }

        }
        return list;
    }
}
