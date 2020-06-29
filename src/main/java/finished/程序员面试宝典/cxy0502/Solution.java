/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0502;

class Solution {
    public String printBin(double num) {
        if (num <= 0 || num >= 1) return "ERROR";
        StringBuilder builder = new StringBuilder();
        builder.append("0.");
        while (num != 0) {
            num *= 2;
            if (num >= 1) {
                builder.append("1");
                num--;
            } else {
                builder.append("0");
            }
            if (builder.length() > 32) return "ERROR";
        }
        return builder.toString();
    }
}
