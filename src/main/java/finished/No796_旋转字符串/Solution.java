/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No796_旋转字符串;

class Solution {
    public boolean rotateString(String A, String B) {
        if(A.equals(B)) return true;
        StringBuilder bd = new StringBuilder(A);
        int n = A.length();
        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            bd.deleteCharAt(0);
            bd.append(c);
            if (B.equals(bd.toString())) return true;
        }
        return false;
    }
}
