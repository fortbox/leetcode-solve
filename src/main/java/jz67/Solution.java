/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package jz67;

import java.math.BigDecimal;

class Solution {
    public static void main(String[] args) {
        String str = "-91283472332";
        int res = strToInt(str);
        System.out.println("res = " + res);
    }

    public static int strToInt(String str) {
        /**
         * 没有逻辑直接照着这个写就行了吧
         *
         */
        if (str == null) return 0;
        boolean isPositive = true;
        boolean isOnce = true;
        char[] array = str.trim().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (builder.length() == 0 && isOnce && (array[i] == '-' || array[i] == '+')) {
                isPositive = array[i] == '+';
                isOnce = false;
                builder.append(array[i]);
            } else if (array[i] >= '0' && array[i] <= '9') {
                builder.append(array[i]);
            } else break;
        }
        if (builder.length() == 0) return 0;
        if (builder.length() == 1 && (builder.charAt(0) == '+' || builder.charAt(0) == '-')) return 0;
        String s = builder.toString();
        System.out.println("s = " + s);

        BigDecimal bigDecimal = new BigDecimal(s);
        if (bigDecimal.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0) return Integer.MIN_VALUE;
        if (bigDecimal.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) return Integer.MAX_VALUE;
        return bigDecimal.intValue();
    }
}