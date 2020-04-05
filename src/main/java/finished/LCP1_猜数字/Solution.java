/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.LCP1_猜数字;

class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] != answer[i]) {
                count++;
            }
        }
        return count;
    }
}
