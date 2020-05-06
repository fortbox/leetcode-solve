/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No925_长按键入;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.charAt(0) != typed.charAt(0)) return false;
        int i = 1;
        int j = 1;
        while (i < name.length() && j < typed.length()) {
            char c = name.charAt(i);
            char d = typed.charAt(j);
            if (c == d) {
                i++;
                j++;
            } else {
                if (d == typed.charAt(j - 1)) {
                    j++;
                } else {
                    return false;
                }
            }
        }
        return i == name.length() && j == typed.length();
    }
}
