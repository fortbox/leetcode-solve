/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1128_等价多米诺骨牌对的数量;

import java.util.Arrays;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        for (int[] dominoe : dominoes) {
            Arrays.sort(dominoe);
        }
        int count = 0;
        for (int i = 0; i < dominoes.length; i++) {
            for (int i1 = i + 1; i1 < dominoes.length; i1++) {
                if (dominoes[i][0] == dominoes[i1][0] && dominoes[i][1] == dominoes[i1][1]) {
                    count++;
                }
            }
        }
        return count;
    }
}
