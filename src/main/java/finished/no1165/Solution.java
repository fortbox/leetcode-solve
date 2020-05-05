/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no1165;

class Solution {
    public int calculateTime(String keyboard, String word) {
        int ans = 0, pre = 0;
        for (int i = 0; i < word.length(); i++) {
            int now = keyboard.indexOf(word.charAt(i));
            ans += Math.abs(now - pre);
            pre = now;
        }
        return ans;
    }
}
