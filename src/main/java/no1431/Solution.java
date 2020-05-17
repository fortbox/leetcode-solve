/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxV = findMax(candies);
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) list.add(candy + extraCandies >= maxV);
        return list;
    }

    private int findMax(int[] candies) {
        int res = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > res) res = candy;
        }
        return res;
    }
}

