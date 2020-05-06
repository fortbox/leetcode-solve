/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no758;

import java.util.ArrayList;

class Solution {
    public static String boldWords(String[] words, String S) {
        /**
         * 三步走
         * 1，获取到所有路径
         * 2，对路径取并集
         * 3，插入分隔符
         */
        String s = S;
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            int index = 0;
            while (index >= 0) {
                int i = s.indexOf(word, index);
                if (i == -1) {
                    break;
                }
                String tmp = i + "-" + (i + word.length());
                if (!list.contains(tmp)) {
                    list.add(tmp);
                }
                index++;
            }
        }
        list.sort((o1, o2) -> {
            String[] a1 = o1.split("-");
            String[] a2 = o2.split("-");
            return a1[0].equals(a2[0]) ? Integer.parseInt(a1[1]) - Integer.parseInt(a2[1]) : Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
        });
        if (list.size() == 0) return S;
        String s2 = list.get(0);
        String[] ss = s2.split("-");
        int start = Integer.parseInt(ss[0]);
        int end = Integer.parseInt(ss[1]);

        ArrayList<String> list1 = new ArrayList<>();
        if (list.size() == 1) list1.add(s2);
        for (int i = 1; i < list.size(); i++) {
            String s1 = list.get(i);
            String[] tmp = s1.split("-");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            if (a > end) {
                list1.add(start + "-" + end);
                start = a;
            }
            if (end < b) end = b;
            if (i == list.size() - 1) {
                list1.add(start + "-" + end);
            }
        }
        char[] array = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= array.length; i++) {
            for (String s1 : list1) {
                String[] sss = s1.split("-");
                int st = Integer.parseInt(sss[0]);
                int en = Integer.parseInt(sss[1]);
                if (i == st) {
                    builder.append("<b>");
                }
                if (i == en) {
                    builder.append("</b>");
                }
            }
            if (i < array.length) {
                builder.append(array[i]);
            }
        }
        return builder.toString();
    }
}


