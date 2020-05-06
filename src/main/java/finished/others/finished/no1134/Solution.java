/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1134;

class Solution {
    public boolean isArmstrong(int N) {
        String s = String.valueOf(N);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += (int) Math.pow((s.charAt(i) - '0'), s.length());
            if (ans > N) return false;
        }
        return ans == N;
    }
}
