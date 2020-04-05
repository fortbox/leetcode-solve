/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1176_健身计划评估;

class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int score = 0;
        for (int i = 0; i < calories.length - k + 1; i++) {
            int calo = 0;
            for (int j = i; j < calories.length && j < i + k; j++) {
                calo += calories[j];
            }
            if (calo < lower) {
                score--;
            }
            if (calo > upper) {
                score++;
            }
        }
        return score;
    }
}