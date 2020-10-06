/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.dp.finished.no638;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        // 最直观的解法，用递归，但是肯定重复计算了，但是比较清晰。
        int sum = 0;
        for (int i = 0; i < needs.size(); i++) {
            sum += price.get(i) * needs.get(i);
        }

        for (List<Integer> list : special) {
            List<Integer> tmp = new ArrayList<>(needs);
            boolean f = true;
            for (int i = 0; i < list.size() - 1; i++) {
                int n = list.get(i);
                if (i >= tmp.size() && n > 0) {
                    f = false;
                    break;
                }
                int m = tmp.get(i);
                if (m < n) {
                    f = false;
                    break;
                }
                tmp.set(i, m - n);
            }
            if (f) {
                sum = Math.min(sum, list.get(list.size() - 1) + shoppingOffers(price, special, tmp));
            }
        }
        return sum;
    }
}