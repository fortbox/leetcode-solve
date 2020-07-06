/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy1626;

import java.util.ArrayDeque;

class Solution {
    public static void main(String[] args) {
        String s = "3/2";
        int ans = calculate(s);
        System.out.println("ans = " + ans);
    }

    public static int calculate(String s) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                deque.add(builder.toString());
                deque.add(String.valueOf(c));
                builder = new StringBuilder();
            } else {
                if (Character.isDigit(c)) {
                    builder.append(c);
                }
            }
        }
        deque.add(builder.toString());
        System.out.println("deque1 = " + deque);
        boolean f = true;
        while (f) {
            ArrayDeque<String> tmp = new ArrayDeque<>();
            boolean hasM = false;
            while (deque.size() > 0) {
                String t = deque.poll();
                if (t.equals("*")) {
                    hasM = true;
                    String a1 = tmp.pollLast();
                    String a2 = deque.pollFirst();
                    int b = Integer.parseInt(a1) * Integer.parseInt(a2);
                    tmp.add(String.valueOf(b));
                } else if (t.equals("/")) {
                    hasM = true;
                    String a1 = tmp.pollLast();
                    String a2 = deque.pollFirst();
                    int b = Integer.parseInt(a1) / Integer.parseInt(a2);
                    tmp.add(String.valueOf(b));
                } else {
                    tmp.add(t);
                }
            }
//            }
            deque = tmp;
            f = hasM;
        }
        System.out.println("deque2 = " + deque);
        while (deque.size() > 1) {
            String s1 = deque.poll();
            String s2 = deque.poll();
            String s3 = deque.poll();
            if (s2.equals("+")) {
                int c = Integer.valueOf(s1) + Integer.valueOf(s3);
                deque.addFirst(String.valueOf(c));
            } else if (s2.equals("-")) {
                int c = Integer.valueOf(s1) - Integer.valueOf(s3);
                deque.addFirst(String.valueOf(c));
            }
        }
        return Integer.parseInt(deque.poll());
    }
}