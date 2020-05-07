/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1232;

import java.util.Arrays;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        Arrays.sort(coordinates, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        int a = coordinates[1][0] - coordinates[0][0];
        int b = coordinates[1][1] - coordinates[0][1];
        System.out.println("a = " + a + " ,b = " + b);
        for (int i = 2; i < coordinates.length; i++) {
            int ta = coordinates[i][0] - coordinates[0][0];
            int tb = coordinates[i][1] - coordinates[0][1];
            System.out.println("ta = " + ta + " ,tb = " + tb);
            if (ta * b != a * tb) return false;
        }
        return true;
    }
}