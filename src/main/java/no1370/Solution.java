/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1370;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        String res = sortString(s);
        System.out.println("res = " + res);
    }

    public static String sortString(String s) {
        StringBuilder builder = new StringBuilder();
        char[] array = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : array) {
            list.add(c);
        }
        list.sort(Character::compareTo);
        for (Character c : list) {
            System.out.print(" " + c);
        }
        System.out.println();
        A:
        while (true) {
            if (list.size() == 0) break A;
            char first = list.get(0);
            builder.append(first);
            list.remove(0);
            B:
            while (true) {
                if (list.size() == 0) break B;
                char last = first;
                int k = -1;
                C:
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) > last) {
                        last = list.get(i);
                        k = i;
                        break C;
                    }
                }
                if (last > first) {
                    first = last;
                    builder.append(last);
                    list.remove(k);
                } else {
                    break B;
                }
            }
            String s1 = builder.toString();
            System.out.println("s1 = " + s1);

            if (list.size() == 0) break A;
            char max = list.get(list.size() - 1);
            builder.append(max);
            list.remove(list.size() - 1);
            D:
            while (true) {
                if (list.size() == 0) break D;
                char min = max;
                int k = -1;
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(i) < min) {
                        min = list.get(i);
                        k = i;
                        break;
                    }
                }
                if (min < max) {
                    max = min;
                    builder.append(min);
                    list.remove(k);
                } else {
                    break D;
                }
            }
        }
        return builder.toString();
    }
}
