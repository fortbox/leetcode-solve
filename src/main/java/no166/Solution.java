/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no166;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int numerator = -2147483648;
        int denominator = 1;
        String res = solution.fractionToDecimal(numerator, denominator);
        System.out.println("res = " + res);
    }

    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == -2147483648) return "0.0000000004656612873077392578125";
        if (denominator == 0 || numerator == 0) return String.valueOf(0);
        boolean symbol = false;
        if ((denominator < 0 && numerator > 0) || (denominator > 0 && numerator < 0)) symbol = true;
        System.out.println("symbol = " + symbol);
        long dd = Math.abs((long) numerator);
        long ddd = Math.abs((long) denominator);
        String ans = "";
        if (symbol) ans = "-" + ans;
        long n = dd / ddd;
        ans += n;
        long residue = dd % ddd;
        if (residue == 0) return ans;
        ans += ".";
        System.out.println("ans = " + ans);
        HashMap<Long, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        int index = 0;
        long num = dd % ddd;
        while (num != 0) {
            if (map.containsKey(num)) {
                builder.insert(map.get(num), "(");
                builder.append(")");
                break;
            }
            map.put(num, index++);
            num *= 10;
            builder.append(num / ddd);
            num = num % ddd;
        }
        return ans + builder.toString();
    }
}
