/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package com;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int n = 1000, m = 1000;
        long begin = System.currentTimeMillis();
        int res = solution.flipLights(n, m);
        long end = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("(end-begin) = " + (end - begin) + "ms");
    }

    public int flipLights(int n, int m) {
        if (m == 0) {
            return 1;
        }
        /**
         * 只想到了暴力解法，实在是惭愧
         * 用一个字符串代表n，然后对每一步求解，然后在set中去除重复
         * 时间复杂度是4的m次方
         * 1代表亮，0代表灭
         * 初始化n个1，然后对每一步分别计算四种情况，然后往set中插入
         */
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("1");
        }
        HashMap<Integer, HashSet<String>> map = new HashMap<>();
        String s = "";
        for (int i = 0; i < m; i++) {
            if (i > 0) {
                HashSet<String> set = map.get(i - 1);
                HashSet<String> set1 = new HashSet<>();
                for (String s1 : set) {
                    StringBuilder builder1 = new StringBuilder(s1);
                    for (int j = 0; j < 4; j++) {
                        if (j == 0) {
                            s = reverseNumber(builder1);
                        }
                        if (j == 1) {
                            s = evenNumber(builder1);
                        }
                        if (j == 2) {
                            s = oddNumber(builder1);
                        }
                        if (j == 3) {
                            s = twoNumbersApart(builder1);
                        }
                        set1.add(s);
                    }
                    map.put(i, set1);
                }
            } else {
                HashSet<String> set = new HashSet<>();
                for (int j = 0; j < 4; j++) {
                    if (j == 0) {
                        s = reverseNumber(builder);
                    }
                    if (j == 1) {
                        s = evenNumber(builder);
                    }
                    if (j == 2) {
                        s = oddNumber(builder);
                    }
                    if (j == 3) {
                        s = twoNumbersApart(builder);
                    }
                    set.add(s);
                }
                map.put(i, set);
            }
        }
        return map.get(m - 1).size();


    }

    private String twoNumbersApart(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i = 3 * i + 1) {
            int n = builder.charAt(i) - '0';
            n = ~n;
            builder.setCharAt(i, (char) (n));
        }
        return builder.toString();
    }

    private String oddNumber(StringBuilder builder) {
        for (int i = 1; i < builder.length(); i += 2) {
            int n = builder.charAt(i) - '0';
            n = ~n;
            builder.setCharAt(i, (char) (n));
        }
        return builder.toString();
    }

    private String evenNumber(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i += 2) {
            int n = builder.charAt(i) - '0';
            n = ~n;
            builder.setCharAt(i, (char) (n));
        }
        return builder.toString();
    }

    private String reverseNumber(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            int n = builder.charAt(i) - '0';
            n = ~n;
            builder.setCharAt(i, (char) (n));
        }
        return builder.toString();
    }
}
