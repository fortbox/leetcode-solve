/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1700;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        if (students.length == 0) return 0;
        if (sandwiches.length == 0) return students.length;
        List<Integer> st = Arrays.stream(students).boxed().collect(Collectors.toList());
        List<Integer> sa = Arrays.stream(sandwiches).boxed().collect(Collectors.toList());
        int len = st.size();
        int len1 = sa.size();
        int index = 0;
        while (index < st.size()) {
            if (!st.get(0).equals(sa.get(0))) {
                Integer n = st.get(0);
                st.remove(0);
                st.add(n);
                index++;
            } else {
                break;
            }
        }
        if (!st.get(0).equals(sa.get(0))) return st.size();
        return countStudents(st.subList(1, st.size()).stream().mapToInt(Integer::intValue).toArray(), sa.subList(1, st.size()).stream().mapToInt(Integer::intValue).toArray());
    }
}