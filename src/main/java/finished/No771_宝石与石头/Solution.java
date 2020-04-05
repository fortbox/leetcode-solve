/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No771_宝石与石头;

import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) result++;
        }
        return result;
    }
}
