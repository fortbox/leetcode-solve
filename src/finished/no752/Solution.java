/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no752;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int openLock(String[] deadends, String target) {
        String init = "0000";
        HashSet<String> set = new HashSet<String>(Arrays.asList(deadends));
        return bfs(set, init, target);

    }

    private int bfs(HashSet<String> set, String init, String target) {
        if (set.contains(init)) return -1;
        if (init.equals(target)) return 0;
        Queue<String> q = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        q.add(init);
        hashSet.add(init);
        int deep = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String s = q.poll();
                if (set.contains(s)) continue;
                if (s.equals(target)) return deep;
                String[] ss = nextS(s);
                for (String s1 : ss) {
                    if (hashSet.add(s1)){
                        q.add(s1);
                    }
                }
            }
            deep++;
        }
        return -1;
    }

    private String[] nextS(String s) {
        char a = s.charAt(0);
        char b = s.charAt(1);
        char c = s.charAt(2);
        char d = s.charAt(3);
        StringBuilder[] ss = new StringBuilder[8];
        if (a == '0') {
            ss[0] = new StringBuilder(s);
            ss[0].setCharAt(0,'1');
            ss[1] = new StringBuilder(s);
            ss[1].setCharAt(0,'9');
        }else if (a=='9'){
            ss[0] = new StringBuilder(s);
            ss[0].setCharAt(0,'0');
            ss[1] = new StringBuilder(s);
            ss[1].setCharAt(0,'8');
        }else {
            ss[0] = new StringBuilder(s);
            ss[0].setCharAt(0, (char) (a-1));
            ss[1] = new StringBuilder(s);
            ss[1].setCharAt(0,(char) (a+1));
        }
        if (b == '0') {
            ss[2] = new StringBuilder(s);
            ss[2].setCharAt(1,'1');
            ss[3] = new StringBuilder(s);
            ss[3].setCharAt(1,'9');
        }else if (b=='9'){
            ss[2] = new StringBuilder(s);
            ss[2].setCharAt(1,'0');
            ss[3] = new StringBuilder(s);
            ss[3].setCharAt(1,'8');
        }else {
            ss[2] = new StringBuilder(s);
            ss[2].setCharAt(1, (char) (b-1));
            ss[3] = new StringBuilder(s);
            ss[3].setCharAt(1,(char) (b+1));
        }
        if (c == '0') {
            ss[4] = new StringBuilder(s);
            ss[4].setCharAt(2,'1');
            ss[5] = new StringBuilder(s);
            ss[5].setCharAt(2,'9');
        }else if (c=='9'){
            ss[4] = new StringBuilder(s);
            ss[4].setCharAt(2,'0');
            ss[5] = new StringBuilder(s);
            ss[5].setCharAt(2,'8');
        }else {
            ss[4] = new StringBuilder(s);
            ss[4].setCharAt(2,(char) (c-1));
            ss[5] = new StringBuilder(s);
            ss[5].setCharAt(2,(char) (c+1));
        }
        if (d == '0') {
            ss[6] = new StringBuilder(s);
            ss[6].setCharAt(3,'1');
            ss[7] = new StringBuilder(s);
            ss[7].setCharAt(3,'9');
        }else if (d=='9'){
            ss[6] = new StringBuilder(s);
            ss[6].setCharAt(3,'0');
            ss[7] = new StringBuilder(s);
            ss[7].setCharAt(3,'8');
        }else {
            ss[6] = new StringBuilder(s);
            ss[6].setCharAt(3,(char) (d-1));
            ss[7] = new StringBuilder(s);
            ss[7].setCharAt(3,(char) (d+1));
        }

        for (int i = 0; i < ss.length; i++) {
            System.out.println("i = " + i +",s="+ss[i].toString());
        }
        String[] strings = new String[8];
        for (int i = 0; i < strings.length; i++) {
            strings[i]=ss[i].toString();
        }
        return strings;
    }
}
