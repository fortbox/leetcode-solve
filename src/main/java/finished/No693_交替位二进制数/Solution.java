/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No693_交替位二进制数;

class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) return false;
        }
        return true;
    }
}