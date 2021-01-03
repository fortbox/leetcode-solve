/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package no5641;

import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (o1, o2) -> o1[1] == o2[1] ? o2[0] - o1[0] : o2[1] - o1[1]);
        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize > boxTypes[i][0]) {
                truckSize -= boxTypes[i][0];
                res += boxTypes[i][0] * boxTypes[i][1];
            } else if (truckSize == boxTypes[i][0]) {
                res += boxTypes[i][0] * boxTypes[i][1];
                break;
            } else if (truckSize < boxTypes[i][0]) {
                res += truckSize * boxTypes[i][1];
                break;
            }

        }
        return res;
    }
}