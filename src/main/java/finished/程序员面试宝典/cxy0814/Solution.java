/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0814;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<String, Integer> history = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "0^1|1|0&0|0|1^0|1&0|0&0";
        int result = 1;
        int ans = solution.countEval(s, result);
        System.out.println("ans = " + ans);
    }

    public int countEval(String s, int result) {
        if (s == null || "".equals(s)) return 0;
        if (s.length() == 1) return s.charAt(0) - '0' == result ? 1 : 0;
        int sum = 0;
        for (int i = 1; i < s.length(); i += 2) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i + 1);

            int a;
            String s6 = s1 + "-0";
            if (history.containsKey(s6)) {
                a = history.get(s6);
            } else {
                a = countEval(s1, 0);
                history.put(s6, a);
            }
            int b;
            String s3 = s1 + "-1";
            if (history.containsKey(s3)) {
                b = history.get(s3);
            } else {
                b = countEval(s1, 1);
                history.put(s3, b);
            }
            int c;
            String s4 = s2 + "-0";
            if (history.containsKey(s4)) {
                c = history.get(s4);
            } else {
                c = countEval(s2, 0);
                history.put(s4, c);
            }
            int d;
            String s5 = s2 + "-1";
            if (history.containsKey(s5)) {
                d = history.get(s5);
            } else {
                d = countEval(s2, 1);
                history.put(s5, d);
            }
            if (result == 0) {
//                System.out.println("s.charAt(i) = " + s.charAt(i));
                switch (s.charAt(i)) {
                    case '&':
                        sum += a * d;
                        sum += b * c;
                        sum += a * c;
                        break;
                    case '^':
                        sum += b * d;
                        sum += a * c;
                        break;
                    case '|':
                        sum += a * c;
                        break;
                    default:
                        System.out.println("不能到这里啊");
                        break;
                }
            } else {
                switch (s.charAt(i)) {
                    case '&':
                        sum += b * d;
                        break;
                    case '^':
                        sum += a * d;
                        sum += b * c;
                        break;
                    case '|':
                        sum += b * d;
                        sum += a * d;
                        sum += b * c;

                        break;
                    default:
                        System.out.println("不能到这里啊");
                        break;
                }

            }
        }
        return sum;
    }
}