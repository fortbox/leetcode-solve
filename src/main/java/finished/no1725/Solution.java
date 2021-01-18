/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no1725;

import java.util.ArrayList;

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < rectangles.length; i++) {
            list.add(Math.max(rectangles[i][0], rectangles[i][1]));
        }
        int maxValue = list.stream().max(Integer::compareTo).get();
        return (int) list.stream().filter(integer -> integer.equals(maxValue)).count();
    }
}